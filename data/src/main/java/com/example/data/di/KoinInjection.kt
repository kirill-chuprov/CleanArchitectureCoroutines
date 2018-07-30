package com.example.data.di

import com.example.data.remote.api.WeatherApi
import org.koin.dsl.module.applicationContext

/**
 * Created by Kirill Chuprov on 7/30/18.
 */
val dataModule = applicationContext {

  bean { WeatherApi() }

}