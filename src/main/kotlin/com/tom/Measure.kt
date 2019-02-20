package com.tom

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    var counter = 1
   /* 產生10萬個執行緒花費的時間
   var ms = measureTimeMillis {
        for (n in 1..100_000){
            thread {
                counter++
            }
        }

    }*/
    //產生10萬個協程花費的時間
    var ms = measureTimeMillis {
        for (n in 1..100_000){
            GlobalScope.launch {
                counter ++
            }
        }
    }
    println(ms)
}