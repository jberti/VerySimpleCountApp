package com.example.jorgeberti.myapplication

class Contador{

    var count: Int

    init {
        count = 0
    }

    fun incCount(): Int{
        return count++
    }

    fun resetCount(){
        count = 0
    }
}