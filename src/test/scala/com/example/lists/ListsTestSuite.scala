package com.example.lists

import org.scalatest.OptionValues
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ListsTestSuite extends AnyFlatSpec with Matchers with OptionValues {

  "palindrome" should "return that the list is a palindrome" in {
    val list = List("A", "B", "C", "D", "C", "B", "A")

    Answers.isPalindrome(list) shouldEqual true
  }
  it should "return that the list is not a palindrome" in {
    val list = List("A", "B", "C", "D", "A", "B", "C")

    Answers.isPalindrome(list) shouldEqual false
  }
  it should "return that the list is a palindrome if it is empty" in {
    Answers.isPalindrome(List.empty) shouldEqual true
  }

  "last" should "return the last element of the list" in {
    val list = List(1, 2, 3, 4, 5)
    Answers.last(list).value shouldEqual 5
  }

  it should "return None when the list is empty" in {
    Answers.last(List.empty) shouldEqual None
  }

  "length" should "return the length of the list" in {
    val list = List(1, 2, 3, 4)

    Answers.length(list) shouldEqual 4
  }

  it should "return zero" in {
    Answers.length(List.empty) shouldEqual 0
  }

  "nth" should "return the nth element of the list" in {
    val list = List(1, 2, 3, 4, 5, 6, 7)

    Answers.nth(5, list).value shouldEqual 6
  }

  it should "return None when the nth position does not exist" in {
    val list = List(1, 2, 3, 4)

    Answers.nth(5, list) shouldEqual None
  }
  it should "return None when the list is empty" in {
    Answers.nth(5, List.empty) shouldEqual None
  }

  "penultimate" should "return the last but one element of the list" in {
    val list = List(1, 2)

    Answers.penultimate(list).value shouldEqual 1
  }

  it should "return None when the list only contains one element" in {
    val list = List(1)

    Answers.penultimate(list) shouldEqual None
  }
  it should "return None when the list is empty" in {
    Answers.penultimate(List.empty) shouldEqual None
  }

  "range" should "return a list of all integers within a given range" in {
    val list = List(1, 2, 3, 4)

    Answers.range(1, 4) shouldEqual list
  }
  it should "return a Nil when the starting number is greater than the finishing number" in {
    Answers.range(10, 4) shouldEqual Nil
  }

  "removeAt" should "remove from the list the element at the given position" in {
    val list = List(1, 2, 3, 4)

    Answers.removeAt(2, list) shouldEqual List(1, 2, 4)
  }

  "reverse" should "reverse a list" in {
    val list = List(1, 2, 3, 4)

    Answers.reverse(list) shouldEqual List(4, 3, 2, 1)
  }

  "reverse" should "return Nil if the list is empty" in {
    Answers.reverse(List.empty) shouldEqual Nil
  }
}
