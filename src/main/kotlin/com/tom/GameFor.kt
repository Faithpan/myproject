package com.tom

import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    val secret = Random.nextInt(10)+1
    println(secret)
    val scanner = Scanner(System.`in`)
    for (i in 1..4){
        print("Please enter a number(${i}/4): ")
        var number = scanner.nextInt()
        println("第${i}次 $number")
        if (secret > number){
            println("lower")
        }else if (secret < number){
            println("higher")
        }else {
            println("Great,the number is $number")
            break
        }
    }
}