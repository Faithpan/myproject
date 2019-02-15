package com.tom

fun main(args: Array<String>) {
//    println("Hello kotlin")
    var s:String? ="abcde"
    s=null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
    val h=Human(66.5f,1.7f)
    println(h.bmi())
    val score=88
    println(score>60)
    val c:Char='A'
//    kotlin不能比較符號 char不屬於整數的數值型態 要轉toInt
    println(c.toInt()>60)
  /*  var age =19
    age = 20
    var weight = 66.5f
    var name :String
    name ="Hank"
    */
}

class Human(var weight:Float,var height:Float,var name:String=""){
    init {
        println("test $weight")
    }
//    constructor(name:String,weight: Float,height: Float)
//    :this(weight,height)
    fun bmi():Float{
        val bmi =weight/(height*height)
        return bmi
    }
    fun hello(){
        println("Hello kotlin")
    }

}