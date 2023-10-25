package com.dam.contador

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var numero by mutableStateOf(0)
    var nombre by mutableStateOf("")
    val numeroList = mutableListOf<Int>()
    var ronda by mutableStateOf(0)
    var startEstado by mutableStateOf("START")


    fun funcionRandom() {

        numero = (0..3).random()
         numeroList.add(numero)

        Log.d("Tag", "Estoy en el random")
    }

    fun sumarRonda() {
        ronda = ronda + 1

        Log.d("Tag", "Nueva ronda")
    }

    fun getNum(): Int {
        return numero
    }
fun getLista():List<Int>{
    return numeroList
}
}
