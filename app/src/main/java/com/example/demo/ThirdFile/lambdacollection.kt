package com.example.demo.ThirdFile

fun main(){

    var num = listOf<Int>(5,6,8,1,20,30)
    var a = num.filter { it > 10 }
    println("Use of filter")
    for (i in a){
        println(i)
    }
    println()

    var b = num.map { it * it }
    println("User of map")
    for (i in b){
        println(i)
    }
    println()

    var d = num.filter { it < 10 }.map { it*it }
    println("User of map and filter together")
    for (i in d){
        println(i)
    }
    println()

    var check = listOf<person>(person("Siya",10), person("Niya",20),person("Sam",15))
    println("Use with class")
    var c = check.map { it.name }.filter { it.startsWith("S") }
    for (i in c){
        println(i)
    }
    println()

    var num1 = listOf<Int>(1,2,10,15,20)
    println("Use of all")
    var check1 = num1.all { it > 10 }
    println(check1)
    println()

    println("Use of any")
    var check2 = num1.any { it > 10 }
    println(check2)
    println()

    println("Use of find")
    var check3 = num1.find { it > 10 }
    println(check3)
    println()

    println("Use of count")
    var check4 = num1.count { it > 10 }
    println(check4)
    println()
}

class person(var name : String , var age : Int)