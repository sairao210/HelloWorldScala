//num is inferred as Int
val num=5
val dec=5.2
// x is inferred as Double. see the data type hierarchy chart.
var x = 1+2*3.5
//list will be of type Double
List(1,2,4.5)
//list will be of type AnyVal
List(1,true)
//final list will be of type Any, check the hierarchy charts
List(1,true,"sai")
//type inference also works for function return types
def addOne(a:Int) = a+1
def func(a:Int) = if(x>0) 1 else "some string"