package com.example.data.remote.entity

import com.bluelinelabs.logansquare.annotation.JsonObject
import com.bluelinelabs.logansquare.annotation.JsonField
import com.example.domain.entity.Forecast

/**
 * Created by Kirill Chuprov on 7/30/18.
 */

@JsonObject
data class ForecastR(
  @JsonField(name = ["city"]) var city: CityR? = null,
  @JsonField(name = ["cod"]) var cod: String? = null,
  @JsonField(name = ["name"]) var name: String? = null,
  @JsonField(name = ["message"]) var message: String? = null,
  @JsonField(name = ["cnt"]) var cnt: Long = 0,
  @JsonField(name = ["main"]) var main: MainR? = null
)

fun ForecastR.toDomain(): Forecast =
  Forecast(
      city = city?.toDomain(),
      cod = cod,
      name = name,
      message = message,
      cnt = cnt,
      main = main?.toDomain()
  )

