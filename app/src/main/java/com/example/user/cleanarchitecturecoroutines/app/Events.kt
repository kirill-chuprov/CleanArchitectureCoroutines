package com.example.user.cleanarchitecturecoroutines.app

/**
 * Created by Kirill Chuprov on 7/30/18.
 */

sealed class Action

data class SelectCity(val city: String) : Action()