package com.example.desafio03.model

import com.example.desafio03.R

class CityDataProvider {

    private val citys = arrayListOf<ciudades>()

    init {
        citys.add(ciudades("Ahuachapán", R.drawable.ahuachapan, 333406))
        citys.add(ciudades("Cabañas", R.drawable.cabanas, 164945))
        citys.add(ciudades("Chalatenango", R.drawable.chalatenango, 204808))
        citys.add(ciudades("Cuscatlán", R.drawable.cuscatlan, 252528))
        citys.add(ciudades("La Libertad", R.drawable.lalibertad, 747662))
        citys.add(ciudades("Morazán", R.drawable.morazan, 199519))
        citys.add(ciudades("La Paz", R.drawable.lapaz, 328221))
        citys.add(ciudades("Santa Ana", R.drawable.santaana, 572081))
        citys.add(ciudades("San Miguel", R.drawable.sanmiguel, 478792))
        citys.add(ciudades("San Salvador", R.drawable.sansalvador, 1740847))
        citys.add(ciudades("San Vicente", R.drawable.sanvicente, 174561))
        citys.add(ciudades("Sonsonate", R.drawable.sonsonate, 463732))
        citys.add(ciudades("La Unión", R.drawable.launion, 263271))
        citys.add(ciudades("Usulután", R.drawable.usulutan, 366040))

    }

    fun getCities() = citys
}