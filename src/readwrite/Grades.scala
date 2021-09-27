package com.sairao210
package readwrite

import io.StdIn._
object Grades extends App {
  println("Hello")
  var done = false
  while (!done){
    var name = readLine("Enter Student name: ")
    print("Enter Student score: ")
    var score = readDouble()
    println("You received an " + (
      if(score > 90) "A"
      else if(score > 80) "B"
      else if(score > 70) "C"
      else if(score > 60) "D"
      else "F"
      )
    )
    print("Enter true if done, false to continue")
    done = readBoolean()
  }
}
