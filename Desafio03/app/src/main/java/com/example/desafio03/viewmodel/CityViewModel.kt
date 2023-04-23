package com.example.desafio03.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import com.example.desafio03.model.CityDataProvider
import com.example.desafio03.model.ciudades
import android.os.Handler
import  android.os.Looper
import androidx.lifecycle.LiveData


class CityViewModel: ViewModel() {
    private val cityData =MutableLiveData<ciudades>()
    private val cities = CityDataProvider().getCities()
    private var currentIndex=0
    private val delay= 2000L

    init {
        loop()
    }

    fun getCityData(): LiveData<ciudades> = cityData

    private fun loop(){
        Handler(Looper.getMainLooper()).postDelayed({updateCity()},delay)
    }

    private fun updateCity(){
        currentIndex++
        currentIndex %= cities.size

        cityData.value = cities[currentIndex]

        loop()
    }
}
