package com.example.demo.SeconfFile

fun main(){

    var result = P()


    with(result){
        result.name = "Jeksina"
        result.age = 20
    }

    result.apply {
        result.name = "Jeksina"
        result.age = 20 }.show()

    println("Name  : ${result.name}")
    println("Age : ${result.age}")
}

class P{
     var name : String = ""
    var age : Int = 1

    fun show(){
        println("Helloo...!!")
    }
}