package com.tom

import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val parkingLot = HashMap<String,Car?>()
    var enter = LocalDateTime.of(2018,12,25,
        8,0,0)
    var car:Car? = Car("AAA-0001",enter)
    parkingLot.put(car!!.id, car)
    car = Car("BBB-0002",enter.plusMinutes(15))
    parkingLot.put(car!!.id, car)
//    Car 1 leaving
    var leave = LocalDateTime.of(2018,12, 25,
        9,0,0)

    car = parkingLot.get("AAA-0001")
    car?.leave = leave
    println("${car?.id} duration: ${car?.duration()}minutes")
    var hours = Math.ceil(car!!.duration()/60.0).toLong()
    println("${car?.id} fee:$ ${hours*30}")
    parkingLot.remove(car?.id) //移除第一台車的資訊
    println(parkingLot.size)
//  Car 2 leaving
    car = parkingLot.get("BBB-0002")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration: ${car?.duration()}minutes")
    hours = Math.ceil(car!!.duration()/60.0).toLong()
    println("${car?.id} fee:$ ${hours*30}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

  /*  val list = listOf(5,1,2,7)
    println(list)
    val scores = listOf(68,88,77,99,50)
    for (score in scores){
        println(score)
    }
    println(list.get(3))
    var mutableList = mutableListOf(5,1,2,7)
    mutableList.add(6)
    println(mutableList)*/
}
