package com.sairao210

object patternMatching extends App{
  def greekAplha(letter: Char) = {
    letter match {
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
      case _ => println("invalid Char")
    }
  }
  println(greekAplha('a'))
  println(greekAplha('B'))
  println(greekAplha('c'))

  def max(x:Int, y:Int) = {
    x>y match {
      case true => x
      case false => y
    }
  }
  println(max(5,78))
}
