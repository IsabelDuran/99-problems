package com.example.lists

trait Exercises {
  def isPalindrome[A](list: List[A]): Boolean
  def last[A](list: List[A]): Option[A]
  def length[A](list: List[A]): Int
  def nth[A](n: Int, list: List[A]): Option[A]
  def penultimate[A](list: List[A]): Option[A]
  def range(from: Int, to: Int): List[Int]
  def removeAt[A](index: Int, list: List[A]): List[A]
  def reverse[A](list: List[A]): List[A]
}
