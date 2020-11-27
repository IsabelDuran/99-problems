package com.example.lists

import org.scalatest.OptionValues
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ListsTestSuite extends AnyFlatSpec with Matchers with OptionValues {

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
}
