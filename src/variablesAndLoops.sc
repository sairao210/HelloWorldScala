//val means immutable
val x = "sai"

//var means mutable variables and we can change the value later
var list1 = List(1,2,3)
println(list1)
list1 = list1.appended(5)
println(list1)

//infix notations are much easier to read
val res = 10.+(30)
val res2 = 10 + 30

val list2 = 10.to(20)
val list3 = 10 to 20

//do not use _ in the naming since it used for wildcard in scala

//loops
//while loop
var x = 10
while (x>=0){
  println(x)
  x = x-1
}
println("blast off")

//for loop
//by expression is needed for reverse order
for(i <- 10 to 0 by -1) {
  println(i)
}

//for comprehension loop
var mylist = for(num <- 1 to 10) yield num * 2

for (i <- mylist.indices) {
  println(mylist(i))
}

var anotherList = for(i <- mylist) yield if(i%5 == 0) "Bus" else i
