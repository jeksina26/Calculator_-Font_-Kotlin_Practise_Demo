package com.example.demo.ThirdFile

val pi: Float by lazy { 3014f }

fun main(){

    var name : String? = "Niya"

    println("Name of the student is ${name?.length}")           // safe call(?.) use it if u dont mind getting null value
    println()

    name.let { println("Name of the student is ${name?.length}")  }     // safe call using let execute only if name is not null
    println()

    var length = name?.length ?: -1                     // elvik operator(?:)
    println("Name of the student is ${length}")
    println()

    println("Name of the student is ${name!!.length}")      // not assertion operator(!!)  use when u r sure value is not null
    println()

    var countryname = country()
//    countryname.cname = "USA"
//    println("Name of the country is ${countryname.cname}")
    countryname.city()
    println()

    val area = pi * 4 * 4
    println("Area : $area")
}

class country{

    lateinit var cname : String

    fun city(){
        cname = "USA"
        println("Name of the country is $cname")
    }
}