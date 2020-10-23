package com.example.demo.ForthFile

import kotlin.concurrent.thread

fun main(){

    println("First thread : ${Thread.currentThread().name}")

    thread {
        println("Background thread : ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Background thread : ${Thread.currentThread().name}")
    }

    println("First thread : ${Thread.currentThread().name}")
}