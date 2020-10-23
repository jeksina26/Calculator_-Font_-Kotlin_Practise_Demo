package com.example.demo.SeconfFile

fun main(){
    var a = C()
    a.talk()
    a.eat()
    a.abc()
}
interface A{
    fun talk()
    fun abc(){
        println("In A...!!")
    }
}
interface B{
    fun eat()
    fun abc(){
        println("In B..!!")
    }
}
class C : A,B{

    override fun talk(){
        println("Takingg..!!")
    }
    override fun eat(){
        println("Eating...!!")
    }
    override fun abc(){
        super<A>.abc()
    }
}