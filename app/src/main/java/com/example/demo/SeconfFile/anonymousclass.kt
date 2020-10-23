package com.example.demo.SeconfFile

interface person{
    fun think()
}

fun main(){
    var human : person = object : person{
        override fun think() {
            println("thinkingg..!!")
        }
    }
    human.think()

    var program = program()
    program.sum(10,20, object : myprogram{
        override fun execute(sum: Int) {
            println("Sum = $sum")
        }
    })

    var l = lambda()
    var lambda : (Int) -> Unit = {s : Int -> println("sum using lambada expression = $s")}
    l.sum(10,20,lambda)

    var program1 = program1()
    var lambda1 : (Int,Int) -> Int = {x : Int,y : Int -> x+y}
    program1.add(20,20,lambda1)

    var result = 0
    var value = valuechange()
    value.add(30,20,{x,y -> result = x+y})
    println("addtion after value change $result")

    var program2 = program2()
    program2.reverse("Hello",{it.reversed()})                   // if only one parameter then it can be used
}

class lambda{                                                       // high level lambda expression
    fun sum(a: Int , b:Int,action : (Int) -> Unit){
        var sum = a+ b
        action(sum)
    }
}

class program1{
    fun add(x : Int , y:Int, action:  (Int,Int) -> Int){
        var result = action(x,y)
        println("Addition of 2 number is  = $result")
    }
}

class valuechange{
    fun add(x : Int , y:Int, action:  (Int,Int) -> Unit){
        action(x,y)
    }
}

class program{                                                      // high level fn
    fun sum(a: Int , b:Int, action : myprogram){
        var sum = a+b
        action.execute(sum)
    }
}

class program2{
    fun reverse(Str : String , action: (String) -> String){
        var result = action(Str)
        println("Reverse String is = $result")
    }
}

interface myprogram{
    fun execute(sum: Int)
}