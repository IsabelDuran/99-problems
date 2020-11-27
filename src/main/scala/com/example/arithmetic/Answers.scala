package com.example.arithmetic

import scala.annotation.tailrec

object Answers extends Exercises {
  override def gcd(a: Int, b: Int): Int = {

    @tailrec
    def euclideanAlg(n: Int, m: Int) : Int = (m,n) match {
      case _ if m > n => euclideanAlg(m, n)
      case _ if m == 0 => n
      case (m, n) => euclideanAlg(m, n % m)
    }

    euclideanAlg(a,b)
  }

  override def isPrime(value: Int): Boolean = {
    @tailrec
    def aux(x: Int, y: Int) : Boolean = x match {
      case _ if x <= 2 => false
      case _ if x % y == 0 => false
      case _ if y <= Math.sqrt(x) => true
      case _ => aux(x, y + 1)
    }

    aux(value, 2)
  }
}
