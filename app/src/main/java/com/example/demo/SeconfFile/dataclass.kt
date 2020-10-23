package com.example.demo.SeconfFile

fun main(){

    var laptop = Laptop("Dell",50000)
    var laptop1 = Laptop("Dell",50000)
    laptop.display()
    var same = laptop.equals(laptop1)
    println(same)
    println(laptop)
    println("laptop ${laptop.brand} prise is ${laptop.Prise}")
}

data class Laptop(var brand : String ,var Prise : Int){
    fun display(){
        println("Its aswsome..!!")
    }
}