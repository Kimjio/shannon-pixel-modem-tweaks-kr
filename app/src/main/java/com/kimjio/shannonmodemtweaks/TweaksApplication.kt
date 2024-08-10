package com.kimjio.shannonmodemtweaks

import android.app.Application
import timber.log.Timber

class TweaksApplication : Application() {
  override fun onCreate() {
    super.onCreate()

    Timber.plant(Timber.DebugTree())
  }
}
