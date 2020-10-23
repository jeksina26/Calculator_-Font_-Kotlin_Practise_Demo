package com.example.demo.ForthFile

fun main(){

    var num : Int = 5

    println("Fact is : ${fact(num)}")
}

fun fact(num : Int) : Int{

    if(num == 0){
        return 1
    }else{
        return num * fact(num-1)
    }
}