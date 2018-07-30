package com.example.domain.entity

/**
 * Created by Kirill Chuprov on 7/30/18.
 */

data class Forecast(
  var city: City? = null,
  var cod: String? = null,
  var name: String? = null,
  var message: String? = null,
  var cnt: Long = 0,
  var main: Main? = Main()
)