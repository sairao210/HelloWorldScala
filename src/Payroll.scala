package com.sairao210

object Payroll extends App {
  var e1 = new Employee("sai","rao", false)
  var e2 = new Employee("harish","babu", isSalaried = true)

  println(e1)
  println(e2)

  println(e1.employeeId)
}

class Employee(val fName:String, val lName:String, var isSalaried:Boolean = false) {
  val employeeId = Employee.newEEID
  def fullName = lName + " " + fName

  override def toString: String = s"Employee Name: $fullName\nEmployeeId: $employeeId\n" +
    (if(isSalaried) "Salaried Employee" else "Hourly Employee") +
    "\n" + "="*20
}

object Employee {
  var employeeId = 0

  def newEEID = {
    employeeId += 1
    employeeId
  }
}