package com.example.thetempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.thetempconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun toCelcius(view: View) {

        Log.i("celcius", "boo")

        val tempString = binding.editTextNumberDecimal.text.toString()

        if (tempString.isNotEmpty()) {

            val tempDouble = tempString.toDouble()

            var celcius = (tempDouble - 32) * 5 / 9

            Toast.makeText(
                this,
                "$tempString°F = ${String.format("%.2f", celcius)}°C",
                Toast.LENGTH_LONG
            ).show()

        } else {

            Toast.makeText(
                this,
                "Please enter a valid temperature",
                Toast.LENGTH_LONG
            ).show()

        }

    }

    fun toFahrenheit(view: View) {

        Log.i("fahrenheit", "bies")

        val tempString = binding.editTextNumberDecimal.text.toString()

        if (tempString.isNotEmpty()) {

            val tempDouble = tempString.toDouble()

            var fahrenheit = (tempDouble * 9 / 5) + 32

            Toast.makeText(
                this,
                "$tempString°C = ${String.format("%.2f", fahrenheit)}°F",
                Toast.LENGTH_LONG
            ).show()

        } else {

            Toast.makeText(
                this,
                "Please enter a valid temperature",
                Toast.LENGTH_LONG
            ).show()

        }

    }
}