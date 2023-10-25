package com.dam.contador

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var num by mutableStateOf(0)
    var namee by mutableStateOf("")
    val numList = mutableListOf<Int>()


    fun funcionRandom() {

        num = (0..3).random()
         numList.add(num)

        Log.d("Tag", "Estoy en el random")
    }


    fun getNumero(): Int {
        return num
    }
fun getLista():List<Int>{
    return numList
}
}
