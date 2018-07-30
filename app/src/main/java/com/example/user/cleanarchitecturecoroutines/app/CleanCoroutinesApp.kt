package com.example.user.cleanarchitecturecoroutines.app

import android.app.Application
import com.example.data.di.dataModule
import com.example.user.cleanarchitecturecoroutines.di.appModule
import org.koin.android.ext.android.startKoin

/**
 * Created by Kirill Chuprov on 7/30/18.
 */

class CleanCoroutinesApp : Application() {

  override fun onCreate() {
    super.onCreate()
    startKoin(this, listOf(appModule, dataModule))

  }

}