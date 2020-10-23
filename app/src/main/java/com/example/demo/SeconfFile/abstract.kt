package com.example.demo.SeconfFile

fun main(){

    var a : alien= Doctor()
    a.think()
    a.talk()
}
abstract class alien(){
    abstract fun think()

    fun talk(){
        println("talkingg..!!")
    }
}
 class human() : alien(){
     override fun think(){
        println("Thinking...!!")
    }
}
class Doctor() : alien(){
     override fun think(){
        println("difficult think...!!")
    }
}