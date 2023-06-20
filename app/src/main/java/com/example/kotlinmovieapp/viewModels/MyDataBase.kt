package com.example.kotlinmovieapp.viewModels

import android.content.Context
import androidx.room.*
import com.example.kotlinmovieapp.data.models.MovieResult
import kotlinx.coroutines.newSingleThreadContext

@Database(entities = arrayOf(MovieResult::class) , version = 1)
@TypeConverters(Converter::class)
abstract class MyDataBase : RoomDatabase() {

    abstract fun getDoe():MyDao

    companion object{

        private var myDatabase : MyDataBase ?= null

        fun initDataBase(context : Context) {
            myDatabase = Room.databaseBuilder(context,MyDataBase::class.java,"movies")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }

        fun getDatabase() = myDatabase
    }


}