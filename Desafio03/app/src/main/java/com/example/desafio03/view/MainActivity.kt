package com.example.desafio03.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import com.example.desafio03.R
import com.example.desafio03.databinding.ActivityMainBinding
import com.example.desafio03.model.ciudades
import com.example.desafio03.viewmodel.CityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val model: CityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        model.getCityData().observe(this, Observer { ciudades ->
            binding.cityImage.setImageDrawable(
                ResourcesCompat.getDrawable(resources, ciudades.img, applicationContext.theme)
            )
            binding.cityNameTV.text = ciudades.name
            binding.cityPopulation.text = ciudades.poblacion.toString()
        })
    }
}