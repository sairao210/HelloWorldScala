package com.sairao210
package readwrite

import java.io._
import io.Source._
object readFromFile extends App {
  val fileName = "src/readwrite/colours.txt"
  for(line <- fromFile(fileName).getLines()) {
    println(line.toUpperCase())
  }
  val colours = fromFile(fileName).getLines().toList
  colours.foreach(println)

  try {
    for (line <- fromFile("random.txt").getLines())
      println(line.toLowerCase())
  } catch {
    case e:FileNotFoundException => println("The file was not found")
    case _:Exception => println("The program has an error")
  }
}
