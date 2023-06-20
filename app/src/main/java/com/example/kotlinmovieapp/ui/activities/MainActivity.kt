package com.example.kotlinmovieapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.kotlinmovieapp.databinding.ActivityMainBinding

import com.example.kotlinmovieapp.viewModels.MainViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var viewModel : MainViewModel
    private lateinit var _binding: ActivityMainBinding
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.getMovies()
        viewModel.mutableLiveData.observe(this) {
            Log.e("TAG", "onCreate: ", )
        }
    }


}