package com.example.domain.repository

import com.example.domain.entity.Forecast

/**
 * Created by Kirill Chuprov on 7/30/18.
 */
interface WeatherRepository {
 suspend fun getWeatherForCity(city: String): Forecast
}