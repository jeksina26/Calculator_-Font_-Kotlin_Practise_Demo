package com.example.demo.SeconfFile

import java.math.BigInteger

fun main(){

    var Student = student()
    var mark = Student.passed(80)
    println("Pass status : $mark")

    var marks = Student.schlorship(60)
    println("Schlorship status : $marks")

    var str : String = "Hello.."
    var str1 : String = "World..!!"
    var str2 : String = "Heyy..!!  "

    var a : Int = 40
    var b : Int = 20

    println("String is : ${str2.add(str,str1)}")
    println("Greater value is : ${a.greater(b)}")           // when user infix u can write like a greater b

    println("posiotion of num in fibonacii series is : ${fibonacci(10000,BigInteger("1"),BigInteger("0"))}")

}

fun String.add(s1 : String, s2 : String) : String{
    return this + s1 + s2
}

infix fun Int.greater(x : Int) :Int{                            // Infix fn has only one parameter
    if (this > x )
        return this
    else
        return x
}

fun student.schlorship(mark : Int) : Boolean{
    return mark > 95
}

tailrec fun fibonacci(n : Int, a : BigInteger , b: BigInteger) : BigInteger{
    if (n==0)
        return b
    else
        return fibonacci(n-1,a+b,a)
}

class student{

    fun passed (mark : Int) : Boolean{
        return mark >60
    }
}