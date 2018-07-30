package com.example.data.remote.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import com.example.domain.entity.Main

/**
 * Created by Kirill Chuprov on 7/30/18.
 */

@JsonObject
class MainR {
  @JsonField(name = ["humidity"]) var humidity: Int = 0
  @JsonField(name = ["pressure"]) var pressure: Float = 0f
  @JsonField(name = ["temp_max"]) var temp_max: Float = 0f
  @JsonField(name = ["sea_level"]) var sea_level: Float = 0f
  @JsonField(name = ["temp_min"]) var temp_min: Float = 0f
  @JsonField(name = ["temp"]) var temp: Float = 0f
  @JsonField(name = ["grnd_level"]) var grnd_level: Float = 0f
}

fun MainR.toDomain(): Main =
  Main(
      humidity = humidity,
      pressure = pressure,
      temp_max = temp_max,
      sea_level = sea_level,
      temp_min = temp_min,
      temp = temp,
      grnd_level = grnd_level
  )