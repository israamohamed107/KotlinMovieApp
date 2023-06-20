package com.example.kotlinmovieapp.viewModels

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlinmovieapp.data.models.MovieModel
import com.example.kotlinmovieapp.data.models.MovieResult

@Dao
interface MyDao {

    @Insert
     fun insertMovies(list : List<MovieResult>)

    @Query("select * from MovieResult")
     fun getMovies() : List<MovieResult>
}