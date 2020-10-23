package com.example.demo.ThirdFile

fun main(){

    var myarray = Array<Int>(5) {0}
    myarray[0]  = 10
    myarray[1]  = 20
    myarray[3]  = 30

    println("Use of array")
    for (i in myarray){
        println(i)
    }
    println()

    var list = listOf<Int>(1,2,3,4)                     // u can not modifie the list or u can't perform any fn
    println("Use of List")
    for (i in list){
        println(i)
    }
    println()

    var mylist = mutableListOf<String>("Ram","Riya","Pal")               // using of mutable list u can modifie the list
    mylist.add("Niya")                                                                     // or u can perform any fn
    mylist[2] = "Siya"
    mylist.remove("Ram")
    println("Use of mutablelist")
    for (i in mylist){
        println(i)
    }
    println()

    var arrylist = ArrayList<Int>()
    arrylist.add(10)
    arrylist.add(20)
    arrylist.add(30)
    arrylist.remove(20)
    arrylist.add(1,50)                                          // when u add element at any postion they replace the element not push the element
    arrylist[2]=100
    println("Use of Arrylist")
    for (i in arrylist){
        println(i)
    }
}