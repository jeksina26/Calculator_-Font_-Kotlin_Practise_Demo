package com.example.demo.FirstFile

import com.example.demo.FirstFile.MyFirstJava

fun main(){

    var area = area(2,3)
    println("Area is : $area")

    var getarea = MyFirstJava.getArea(10,20)
    println("Area from java file is : $getarea")

    var rect = rect(2,3)
    println("Area of rectangle is : $rect")
}

fun area(l:Int , b:Int , h:Int=10) : Int{
    return l*b*h
}

fun add(a:Int , b:Int) : Int=a+b

@JvmOverloads
fun rect(l:Int , b:Int , h:Int=10) :Int{
    return l*b*h
}
