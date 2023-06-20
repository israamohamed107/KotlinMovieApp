package com.example.kotlinmovieapp.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinmovieapp.data.models.MovieResult

class MainViewModel : ViewModel() {


    var repository = Repository()
    var mutableLiveData = MutableLiveData<List<MovieResult>>()

    init {
        mutableLiveData = repository.mutableLiveData
    }

    fun getMovies(){
        repository.getMovieRemote()
    }
}