package com.example.data.repository

import com.example.data.remote.api.WeatherApi
import com.example.data.remote.await
import com.example.data.remote.entity.toDomain
import com.example.domain.entity.Forecast
import com.example.domain.repository.WeatherRepository

/**
 * Created by Kirill Chuprov on 7/30/18.
 */
class WeatherRepositoryImpl constructor(private val weatherApi: WeatherApi) : WeatherRepository {
  private val appId = "f08f5bce8d0fe0c0903f145a88d773f8"

  override suspend fun getWeatherForCity(city: String): Forecast {

    return weatherApi.service.getForecastByCity(appId, city, "imperial").await().toDomain()
  }
}