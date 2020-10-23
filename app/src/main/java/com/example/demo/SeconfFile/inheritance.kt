package com.example.demo.SeconfFile

fun main() {

    var think : Human = Alien(20)
    think.think()
}

open class Human(age : Int){

    init {
        println("In human..$age")
    }
    open fun think(){
        println("Real Thinking...!!")
    }
}

class Alien(age : Int) : Human(age){

    init {
        println("In alien..!!")
    }
    override fun think(){
        println("Virtual thinking..!!")
    }
}

