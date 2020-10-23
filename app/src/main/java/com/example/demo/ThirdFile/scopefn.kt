package com.example.demo.ThirdFile

fun main(){

    var person = Person()

    var bio = with(person){                 // return tye = lambda   ,    context object = this
        println("Name of the person is : $name")
        println("Age of the person is : $age")
        age + 54
    }
    println("Age after 5 year = $bio")
    println()

    var person1 = Person1().apply {             //  context object  =  this
        name = "Riya"
        age = 15
    }

    with(person1){                                  // return type  =  context object itself
        println("Name of the person is : $name")
        println("Age of the person is : $age")
    }
    println()

    person.also {
        it.name = "Mitali Sinha"
        println("Name of the person is = ${person.name}")
    }
    println()

    var person3 : Person3? =  Person3()
    var bio1 = person3?.run {
        println("Name of the person is : $name")
        println("Age of the person is : $age")
        age + 5
    }
    println("Age after 5 year = $bio1")
}

class Person{
    var name : String = "Niya Sharma"
    var age : Int = 20
}

class Person1{
    var name : String = ""
    var age : Int = 1
}

class Person3 {
    var name : String = "Niya Sharma"
    var age : Int = 20
}