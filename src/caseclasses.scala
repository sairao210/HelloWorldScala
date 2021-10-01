package com.sairao210

object caseclasses extends App {
  val p1 = Person("sai", 25)
  val p2 = Person("vamshi", 24)
  val p3 = Person("sai", 45)

  for(p <- List(p1,p2,p3)){
    p match {
      case Person(name, 45) => {
        println("old age people:")
        p.aim
      }
      case Person(_, 24) => {
        println("young people:")
        p.aim
      }
      case _ => println("Shit!!")
    }
  }

}

// case class
// parameters are automatically 'val' type
// case class has apply method automatically
// they also have proper hashcode and toString methods, so safe to use in collections
case class Person(name:String, age:Int) {
  def aim = {
    if(age > 40) println(s"$name says, no time to accomplish the aim now")
    else println(s"$name says, no aim now")
  }
}
