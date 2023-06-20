package com.example.kotlinmovieapp.data.network

import com.example.kotlinmovieapp.Const
import com.example.kotlinmovieapp.data.models.MovieModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiCalls {

    @GET("discover/movie")
    fun getMovies(@Query("api_key") api_key: String = Const.API_KEY): Call<MovieModel>
}