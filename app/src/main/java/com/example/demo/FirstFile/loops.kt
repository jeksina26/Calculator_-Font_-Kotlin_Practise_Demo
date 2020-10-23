package com.example.demo.FirstFile

fun main(args : Array<String>) {

    var result = max(10, 30)
    println(result)

    var i: Int = 1
    var j = 1

    var x: Int = 3
    var r: String = when (x) {
        in 1..10 -> "One"
        2 -> "Two"
        3 -> "Thrre"
        4 -> "Four"
        else -> "Enter proper value"
    }
    println(r)

    println("Using For loop")
    for (i in 1..5){
        println(i)
    }
    println()

    println("Using While loop")
    while (i<10){
        if (i%2==0) {
            println(i)
        }
        i++
    }
    println()

    println("Using Do While loop")
    do {
        println(j)
        j++
    }while (j<=5)
    println()

    println("Use of Break")
    for (i in 1..5){
        println(i)
        if (i==2)
            break
    }
    println()

    println("User of Continue")
    for (i in 1..5){
        if (i==2)
            continue
        println(i)
    }
    println()

    println("Use of loop into loop of break")
    myloop@ for (i in 1..3){
        for (j in 1..3){
            if (i==2 && j==3)
                break@myloop
            println("$i $j")
        }
    }
    println()

    println("Use of loop into loop of continue")
    myloop@for (i in 1..3){
        for (j in 1..3){
            if (i==2 && j==2)
                continue@myloop
            println("$i $j")
        }
    }
}

fun max(a : Int , b:Int) : Int = if (a>b) a else b


