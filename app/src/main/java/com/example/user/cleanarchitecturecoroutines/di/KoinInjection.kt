package com.example.user.cleanarchitecturecoroutines.di

import com.example.data.repository.WeatherRepositoryImpl
import com.example.domain.interactor.GetWeatherForCityUseCase
import com.example.domain.repository.WeatherRepository
import org.koin.dsl.module.applicationContext

/**
 * Created by Kirill Chuprov on 7/30/18.
 */

val appModule = applicationContext {

  bean { WeatherRepositoryImpl(get()) as WeatherRepository }
  factory { GetWeatherForCityUseCase(get()) }

}
