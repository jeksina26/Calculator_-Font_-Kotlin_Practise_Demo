package com.example.demo.SeconfFile

fun main(){

    var Name = personname("Jeksina",15)
    println("Id of the person is : ${Name.id}")
}

class personname(var name : String){

    var id : Int = 1

    init {
        println("Name of the person is : $name and id is : $id")
    }
    constructor(name : String , id : Int) : this(name){
        this.id = id
    }

}