package com.example.kotlinmovieapp.data.network

import com.example.kotlinmovieapp.Const
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroConnection {

    private val retrofit : Retrofit = Retrofit.Builder().baseUrl(Const.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getApiCall() : ApiCalls = retrofit.create(ApiCalls::class.java)
}