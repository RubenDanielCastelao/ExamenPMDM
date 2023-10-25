package com.dam.contador

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var nombre = DataClasses.Nombre("Nombre")
    var numero = DataClasses.NumeroActual("UltimoNumeroAleatorio")
    var numeroList = mutableStateListOf<Int>()
    fun funcionRandom() {

        numero.num = (0..3).random()
        numeroList.add(numero.num)

        Log.d("Tag", "Estoy en el random")
    }


    fun getNum(): Int {
        return numero.num
    }
fun getLista():List<Int>{
    return numeroList
    }
}
