package com.dam.contador

class DataClasses {

    data class Datos(var num: Int = 0,
                     var nom: String = "",
                     val numList: MutableList<Int> = mutableListOf()
    )
    }