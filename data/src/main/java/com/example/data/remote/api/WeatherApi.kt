package com.example.data.remote.api

import com.example.data.remote.entity.ForecastR
import com.github.aurae.retrofit2.LoganSquareConverterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Kirill Chuprov on 7/30/18.
 */
class WeatherApi {


  interface Service {

    @GET("/data/2.5/weather") fun getForecastByCity(
      @Query("appid") appid: String,
      @Query("q") city: String,
      @Query("units") units: String? = null
    ): Call<ForecastR>
  }
  private val URL = "http://api.openweathermap.org"

  private val retrofit = Retrofit.Builder()
      .baseUrl(URL)
      .addConverterFactory(LoganSquareConverterFactory.create())
      .build()

  val service = retrofit.create(Service::class.java)!!
}