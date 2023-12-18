package com.D121211019.TaskBerita

import android.app.Application
import com.D121211019.TaskBerita.data.AppContainer
import com.D121211019.TaskBerita.data.DefaultAppContainer

class MyApplication: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}