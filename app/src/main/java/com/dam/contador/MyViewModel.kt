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


    fun funcionRandom() {

        numero = (0..3).random()
        numeroList.add(numero)

        Log.d("Tag", "Estoy en el random")
    }


    fun getNumero(): Int {
        return numero
    }
fun getLista():List<Int>{
    return numeroList
    }
}
