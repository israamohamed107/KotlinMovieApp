package com.example.kotlinmovieapp.viewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.kotlinmovieapp.data.models.MovieModel
import com.example.kotlinmovieapp.data.models.MovieResult
import com.example.kotlinmovieapp.data.network.RetroConnection
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    var mutableLiveData = MutableLiveData<List<MovieResult>>()

    fun getMovieRemote() {
        RetroConnection.getApiCall().getMovies()
            .enqueue(object : Callback<MovieModel>{
                override fun onResponse(call: Call<MovieModel>, response: Response<MovieModel>) {
                    mutableLiveData.value = response.body()?.results
                }

                override fun onFailure(call: Call<MovieModel>, t: Throwable) {

                }

            })
    }

    private fun getMovieLocal() = MyDataBase.getDatabase()?.getDoe()?.getMovies()!!

    private fun insertMovies(movies: List<MovieResult>?) {

        movies?.let {
            MyDataBase.getDatabase()?.getDoe()?.insertMovies(it)
        }
    }


    private fun Any.enqueue(callback: Callback<MovieResult>) {

    }
}