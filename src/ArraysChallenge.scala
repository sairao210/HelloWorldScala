package com.sairao210

object ArraysChallenge extends App {

  def average(list: Array[Int]) ={
    var sum = 0.0
    list.foreach( sum += _)
    sum/list.length
  }

  def max(list: Array[Int]) = {
    var max = Int.MinValue
    for(i <- list) if(i > max) max = i
    max
  }

  def min(list: Array[Int]) = {
    var min = Int.MaxValue
    for(i <- list) if(i < min) min = i
    min
  }

  val arr = Array(1,2,3,4,5,6,7,8,9,10)
  println("average: " + average(arr))
  println("max: " + max(arr))
  println("min: " + min(arr))

}
