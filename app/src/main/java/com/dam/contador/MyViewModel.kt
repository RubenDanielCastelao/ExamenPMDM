package com.dam.contador

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var datos = DataClasses.Datos(1, "Hola")
    fun funcionRandom() {

        val datosAct = datos.copy(num = (0..3).random())
        datos = datosAct

        Log.d("Tag", "Estoy en el random")
    }

    fun updateName(newName: String) {
        val datosAct = datos.copy(nom = newName)
        datos = datosAct
    }

    fun getNum(): Int {
        return datos.num
    }

fun getLista():List<Int>{
        return datos.numList
    }
}
