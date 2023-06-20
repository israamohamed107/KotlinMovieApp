package com.example.kotlinmovieapp.viewModels

import androidx.room.TypeConverter
import com.example.kotlinmovieapp.data.models.MovieResult
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class Converter {

    @TypeConverter
    fun fromStringToList(string: String):List<Int>{
        val listType : Type = object : TypeToken<List<Int>>(){}.type
        val gson = Gson()
        return gson.fromJson(string,listType)
    }
    @TypeConverter
    fun fromListToString(list: List<Int>):String{
        val gson=Gson()
        return gson.toJson(list)
    }
}