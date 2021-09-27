//sets examples
val fruits = Set("apple", "banana")
var moreFruits = Set("pineapple")
var nums = Set(1,2,3,4,5)
var moreNums = Set(4,5,8,9,10)
// combine the sets aka UNION
var mixed = fruits ++ nums
//remove a element from the set
mixed -= 5
println(mixed)
// intersection of two sets
nums & moreNums

moreNums.head
moreNums.tail
moreNums.isEmpty

//maps examples
var groceries = Map(1 -> "milk", 2 -> "bread", 3 -> "juice")
groceries += 5 -> "brownie"
groceries.get(3)
groceries(3)
groceries.getOrElse(7, "No Match")
for(v <- groceries.values){
  println(v)
}
var z = for((k,v) <- groceries) yield v -> k

//tuples examples
val v = (1, 1.4, "Hello")
// accessing 3rd element, index starts from 1
var x = v._3
val (first, second, third) = v

//zip method
val symbols = Array("<", "-", ">")
val counts = Array(2,10,2)
val pairs = symbols.zip(counts) // pairs will be of type tuples
for( pair <- pairs ) {
  val (symbol, count) = pair
  print(symbol * count)
}

def divide10(n:Int): Tuple2[Int, Int] = (n/10, n%10)

divide10(23)


//array examples
var nums = new Array[Any](10)
var furniture = Array("chair", "sofa", "bed", "table")
for(f <- furniture) println(f)
// access particular element
println(furniture(0))
var a = Array(1,2,3,4,5,6)
var result = for(n <- a) yield 2*n
//comprehensions with guarding
var even = for(n <- a  if(n%2==0)) yield n

// lists examples
// they are like arrays, but elements in the list cannot be changed but assigning a new value
var l = List(3.0, 9, 'a')
var l2 = 3.0::1::2::3::4::Nil
var  l3 = List.range(10,20)
var l4 = 10 to 20
// merge two lists
var l5 = l3:::l
var sum = 0
l3.foreach(sum += _)
println(sum)

val list1 = (1,2)::(3,4)::Nil
for((a,b) <- list1) yield a+b