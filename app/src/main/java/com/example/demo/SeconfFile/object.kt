package com.example.demo.SeconfFile

fun main(){

    bookself.books.add(book("Herrypotter",2000))
    bookself.books.add(book("kotlin",1000))
    bookself.books.add(book("java",2000))
    bookself.show()

    X.display()

}
data class book(var name : String, var price : Int ){

}
object bookself{

    var books = arrayListOf<book>()

    fun show(){
        for (i in books){
            println(i)
        }
        println()
    }
}

class X{
    companion object{
        fun display(){
            println("Helloo..!! Companion object")
        }
    }
}