package com.example.lists

object Answers extends Exercises {
  override def isPalindrome[A](list: List[A]): Boolean = ???

  override def last[A](list: List[A]): Option[A] = ???

  override def length[A](list: List[A]): Int = ???

  override def nth[A](n: Int, list: List[A]): Option[A] = ???

  override def penultimate[A](list: List[A]): Option[A] = ???

  override def range(from: Int, to: Int): List[Int] = ???

  override def removeAt[A](index: Int, list: List[A]): List[A] = ???

  override def reverse[A](list: List[A]): List[A] = ???
}
