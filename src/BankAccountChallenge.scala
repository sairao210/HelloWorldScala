package com.sairao210

import BankAccount.newAccNumber

import com.sairao210.AccountTypes.{AccountType, Checking, Savings}

object BankAccountChallenge extends App {
  val b1 = new BankAccount("sai",6000, Savings)
  val b2 = new BankAccount("vamshi", 1000, Checking)

  b1.credit(20000)
  println(b1)
  println(b2)

}

case class BankAccount(val name:String, var balance:Double, val accType: AccountType) {
  val accountNumber = newAccNumber()

  def debit(amt:Double) = balance -= amt

  def credit(amt:Double) = balance += amt
}

object BankAccount {
  var accNumber = 5000
  def newAccNumber(): Unit = {
    accNumber += 1
    accNumber
  }
}

object AccountTypes extends Enumeration {
  type AccountType = Value
  val Savings, Checking = Value
}