package com.inno.dalnoboy

import android.app.Application
import com.inno.common.di.AppProvider
import com.inno.dalnoboy.di.DaggerAppComponent

class App:Application() {

    lateinit var appProvider: AppProvider
        private set

    override fun onCreate() {
        super.onCreate()

        appProvider = DaggerAppComponent
            .builder()
            .build()
    }

    fun mainProvider(): Any = appProvider
}

val Application.appProvider: AppProvider
    get() = (this as App).appProvider