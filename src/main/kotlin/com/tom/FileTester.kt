package com.tom

import java.io.File

fun main(args: Array<String>) {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
//    writeTest()
}

private fun writeTest() {
    //    File("output.txt").writeText("abc123")
    /* File("output.txt").printWriter().use {
         it.println("1st line")
         it.println("2nd line")
         it.println("3nd line")
     }*/
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3nd line\n")
        it.write("4nd line\n")
    }
}