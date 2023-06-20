package com.example.kotlinmovieapp.viewModels

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        MyDataBase.initDataBase(this)
    }
}