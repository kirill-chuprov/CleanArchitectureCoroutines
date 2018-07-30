package com.example.user.cleanarchitecturecoroutines.app

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import androidx.core.widget.toast
import com.example.domain.entity.Forecast
import com.example.user.cleanarchitecturecoroutines.R
import com.example.user.cleanarchitecturecoroutines.R.layout
import kotlinx.android.synthetic.main.activity_main.moscow
import kotlinx.android.synthetic.main.activity_main.newyork
import kotlinx.android.synthetic.main.activity_main.paris
import kotlinx.android.synthetic.main.activity_main.progress
import kotlinx.android.synthetic.main.activity_main.temperature
import kotlinx.android.synthetic.main.activity_main.the_weather_in

class MainActivity : AppCompatActivity() {

  private lateinit var model: MainModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
    initModel()
    moscow.setOnClickListener { model.action(SelectCity("Moscow")) }
    newyork.setOnClickListener { model.action(SelectCity("New York")) }
    paris.setOnClickListener { model.action(SelectCity("Paris")) }

  }

  private fun initModel() {
    model = ViewModelProviders.of(this)
        .get(
            MainModel::class.java
        )
    model.loading.observe { displayLoading(it == true) }
    model.city.observe { displayForecast(it!!) }
    model.message.observe { displayMessage(it ?: "") }
  }

  private fun displayLoading(loading: Boolean) {
    progress.visibility = if (loading) View.VISIBLE else View.INVISIBLE
  }

  private fun displayForecast(forecast: Forecast) {
    the_weather_in.text = getString(R.string.weather, forecast.name)
    temperature.text = getString(R.string.temperature, forecast.main?.temp?.toInt())
  }

  private fun displayMessage(message: String) {
    if (message.isNotBlank()) toast(message)
  }

  private fun <T> LiveData<T>.observe(observe: (T?) -> Unit) =
    observe(this@MainActivity, Observer { observe(it) })
}
