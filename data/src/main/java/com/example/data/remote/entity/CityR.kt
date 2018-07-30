package com.example.data.remote.entity

import com.bluelinelabs.logansquare.annotation.JsonField
import com.bluelinelabs.logansquare.annotation.JsonObject
import com.example.domain.entity.City

/**
 * Created by Kirill Chuprov on 7/30/18.
 */

@JsonObject
data class CityR(
  @JsonField(name = ["id"]) var id: Long = 0,
  @JsonField(name = ["name"]) var name: String? = null
)

fun CityR.toDomain(): City =
  City(
      id = id,
      name = name
  )