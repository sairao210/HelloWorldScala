var today = "Tuesday"

if(today equals "Monday") println("It might rain")
else println("It is not monday, so wont rain")

var b = 5
var a = if(b<0) -1 else 1
println(a)

println(if(b<0) "-" else if (b==0) "0" else "+")

var rate = 10.50
def earnings(s:String, h:Double):String = {
  var salary = 0.0
  if(s != "y"){
    if(h<=40) salary = h * rate
    else salary = 40 * rate + (h-40) * rate * 1.5
    s"Salary is $salary"
  }
  else "This is salaried employee"
}

println(earnings("n",30))
println(earnings("n",45))
println(earnings("y",40))