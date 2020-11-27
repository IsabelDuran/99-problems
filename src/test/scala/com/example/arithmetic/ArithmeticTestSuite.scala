package com.example.arithmetic

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ArithmeticTestSuite extends AnyFlatSpec with Matchers {
  /*"isPrime" should "return true when a number is prime" in {
    Answers.isPrime(7) shouldEqual true
  }
  it should "return false when a number is not prime" in {
    Answers.isPrime(10) shouldEqual false
  }*/

  "gcd" should "return the greater common denominator of two given numbers" in {
    Answers.gcd(270, 192) shouldEqual 6
  }
}
