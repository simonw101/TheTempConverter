package com.example.thetempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.thetempconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun toCelcius(view: View) {



    }

    fun toFahrenheit(view: View) {



    }
}