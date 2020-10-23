package com.example.demo.ForthFile

import java.lang.NumberFormatException

fun main(){

    var str : String = "4a"
    var num : Int = try {
        str.toInt()
    }catch (e : NumberFormatException){
        0
    }
    num++
    println("Exeption Number is  : $num")


    var str1 : String = "4"
    var num1 : Int = str1.toInt()
    num1++
    println("Number is  : $num1")

}