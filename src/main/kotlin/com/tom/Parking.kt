package com.tom

import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter = LocalDateTime.of(2018,12,
        25,8,0,0)
    val leave = LocalDateTime.of(2018,12,
    25,10,8,0)
    var car = Car("AAA-0001",enter)
//    去呼叫下面的leave屬性 setter方法
    car.leave = leave
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
    println(hours*30)
}

class Car(val  id:String,val enter: LocalDateTime){
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value))
//                this.leave = value 這樣寫會被誤為又要再呼叫 而進入無窮迴圈
                field = value //field代表leave
        }
   /* fun duration():Long{
      return  Duration.between(enter,leave).toMinutes()
    }*/
    fun duration() =Duration.between(enter,leave).toMinutes()
}