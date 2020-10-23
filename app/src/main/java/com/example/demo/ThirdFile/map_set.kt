package com.example.demo.ThirdFile

import android.os.Build
import androidx.annotation.RequiresApi


@RequiresApi(Build.VERSION_CODES.N)
fun main(){

    var myMap = mapOf<Int,String>(2 to "Ram" , 10 to "Parth" , 4 to "Riya")             // u can not change value u can read only OR not user put
    for (i in myMap.keys)                                                                          // or remove ect fn
    {
        println("$i : ${myMap[i]}")
    }
    println()

    var mutableMap = mutableMapOf<Int,String>(2 to "Ram" , 10 to "Parth" , 4 to "Riya")    // if u use mutablemap u can change value
    mutableMap.put(1,"Niya")                                                                                    // OR  user put or remove ect fn
    for (i in mutableMap.keys)
    {
        println("$i : ${mutableMap[i]}")
    }
    println()


    var map = hashMapOf<Int,String>()                                   // u can change the value and u can use all the fn
    map.put(1,"Ram")
    map.put(5,"Riya")
    map.remove(5)
    map.put(10,"Riya")
    map.replace(1,"Niya")

    for (i in map.keys)
    {
        println("$i : ${map[i]}")
    }
    println()




    var set = setOf<Int>(10,15,30,30,5)                  // remove duplicate data and give result in sequence
    println("Use of set")
    for (i in set){
        println(i)
    }
    println()

    var setm = mutableSetOf<Int>(10,30,30,2,4,5)                  // if u use mutableset then u can use the fun and change setof value
    setm.add(50)                                                                 // when u add the element it add at the end of the list
    println("Use of mutableset")
    for (i in setm){
        println(i)
    }
    println()

    var myset = hashSetOf<Int>(30,30,2,4,6)         // remove duplicate data and give result not in sequence
    myset.remove(10)
    myset.add(12)
    println("Using hashset")
    for (i in myset){
        println(i)
    }

}