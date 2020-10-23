package com.example.demo.FirstFile

fun main(args : Array<String>){
    println("Hello")

    var a : Int = 10;
    println(a)

    var obj = Demo()
    obj.name = "Jeksina"
    println("The name of the person is : ${obj.name}")

    obj.n = "Swati"
    obj.display(obj.n)

    var obj1 = person1("Ask")
    obj1.show()

    var obj2 = person()
    obj2.c = "Aman"
    println(obj2.c)

    var names : String = "Jeksina"
    var age : Int = 20
    var combine = names + age
    println("The name of the persion is $names. And Age of the person is $age. And the length is ${combine.length}")

    var rect = Rect()
    rect.l = 10
    rect.b = 20
    var Result = rect.l * rect.b
    println("Length is ${rect.l} And breadth is ${rect.b} And the ares is $Result")

    var range = 1..5            // same as rangeTo
    println("Print 1 to 5 using range")
    for(i in range){
        println(i)
    }
    println()

    var range1 = 10.downTo(1)
    println("Range in reverse order is")
    for (i in range1 step 2){
        println(i)
    }
    println()

    var range2 = 'A'..'Z'
    println("Print A to Z using range")
    for (i in range2){
        println(i)
    }
    println()

    var ispreasent = 'J' in range2
    println(ispreasent)
}
class Demo{

    var name : String = ""
    var n : String = ""

   fun display(n : String){
       println(n)
   }
}

class Rect{
    var l : Int = 0
    var b : Int = 0
}

