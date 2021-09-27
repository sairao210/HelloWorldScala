import scala.collection.immutable

// declaring a function syntax
// def fnName(parameters): returnType = {...}
// factorial function, return type is inferred
def factorial(n:Int) = {
  var result = 1
  for(i <- 1 to n) result *= i
  result
}
factorial(5)

//a recursive factorial function, return type of function has to mentioned. Compiler can't infer
def recFac(n:Int): Int = if(n<=0) 1 else n * recFac(n-1)
recFac(5)

def abs(x:Int) = if(x<0) -x else x
abs(-5)

//function with named parameters and default values
def printName(left:String="[", firstName: String, lastName:String, right: String="]"): Unit ={
  println(left + firstName + " " + lastName + right)
}
printName(lastName = "last", firstName = "first")
printName(firstName = "first", lastName = "last", right = ")")

// variable length parameters
//int* means there can be more than one
def sum(args:Int*) = {
  var result = 0
  for (i <- args) result += i
  result
}
sum(4,5,6,7,89,9)

//anonymous functions/lambda functions
val func = (i:Int) => i * 2
func(5)

//higher order functions - functions that take other functions as input and return a functions
val doubleFunc = (i:Int) => i * 2
def higherOrderFunc(x:Int, y: Int => Int) = y(x)

higherOrderFunc(6,doubleFunc)
val triple = (i:Int) => i*3
higherOrderFunc(6, triple)

//below function returns another functions
def sayHello: String => String = {
  (name:String) => {"Hello " + name}
}
var message = sayHello("Peggy")

//closures - function return value depends on variable declared out side of the function
var outside = 25
val closureFunc = (i:Int) => outside * i
closureFunc(3)
outside = 15
closureFunc(3)

//cons operator to make a list, ending with Nil indicates end of the list
val example = 1::2::3::4::Nil