package com.example.domain.interactor

import com.example.domain.entity.Forecast
import com.example.domain.repository.WeatherRepository

/**
 * Created by Kirill Chuprov on 7/30/18.
 */
class GetWeatherForCityUseCase constructor(private val weatherRepository: WeatherRepository) {

  suspend fun getWeatherByCity(city: String): Forecast = weatherRepository.getWeatherForCity(city)
}