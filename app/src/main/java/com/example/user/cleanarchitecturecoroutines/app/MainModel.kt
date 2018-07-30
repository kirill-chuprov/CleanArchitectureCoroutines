package com.example.user.cleanarchitecturecoroutines.app

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.data.remote.unit
import com.example.domain.entity.Forecast
import com.example.domain.interactor.GetWeatherForCityUseCase
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.channels.actor
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

/**
 * Created by Kirill Chuprov on 7/30/18.
 */
class MainModel : ViewModel(), KoinComponent {

  private val mutableCity = MutableLiveData<Forecast>().apply { value = Forecast() }
  private val mutableLoading = MutableLiveData<Boolean>().apply { value = false }
  private val mutableMessage = MutableLiveData<String>()
  private val getWeatherForCityUseCase: GetWeatherForCityUseCase by inject()

  val city: LiveData<Forecast> = mutableCity
  val loading: LiveData<Boolean> = mutableLoading
  val message: LiveData<String> = mutableMessage

  private val actor = actor<Action>(UI, Channel.CONFLATED) {
    for (action in this) when (action) {
      is SelectCity -> {
        mutableLoading.value = true
        try {
          val weatherByCity = getWeatherForCityUseCase.getWeatherByCity(action.city)
          mutableCity.value = weatherByCity
        } catch (e: Exception) {
          mutableMessage.value = e.toString()
        }
        mutableLoading.value = false
      }
    }
  }

  init {
    action(SelectCity("Paris"))
  }

  fun action(action: Action) = actor.offer(action)

  override fun onCleared() = actor.close().unit

}