package com.example.demo.ThirdFile

fun main(){
     var name : String? = "Hello"

    var a = name?.let {         // return type  == lambda  ,    context object =  it
        println(it.reversed())
        println(it.capitalize())
       it.length
    }
    println(a)
}