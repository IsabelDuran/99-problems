package com.example.arithmetic

object Answers extends Exercises {
  override def gcd(a: Int, b: Int): Int = {
    def euclideanAlg(n: Int, m: Int) : Int = (m,n) match {
      case _ if m > n => euclideanAlg(m, n)
      case _ if m == 0 => n
      case (m, n) => euclideanAlg(m, n % m)
    }

    euclideanAlg(a,b);
  }

  override def isPrime(value: Int): Boolean = ???
}
