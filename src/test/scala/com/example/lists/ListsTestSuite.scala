package com.example.lists

import org.scalatest.OptionValues
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ListsTestSuite extends AnyFlatSpec with Matchers with OptionValues {

  "length" should "return the length of the list" in {
    val list = List(1, 2, 3, 4)

    Answers.length(list) shouldEqual 4
  }

  it should "return zero" in {
    Answers.length(List.empty) shouldEqual 0
  }
}
