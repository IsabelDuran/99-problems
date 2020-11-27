package com.example.lists

import scala.annotation.tailrec

object Answers extends Exercises {
  override def isPalindrome[A](list: List[A]): Boolean = {
    @tailrec
    def aux(pos: Int, listA: List[A], listB: List[A], a: Boolean) : Boolean = (listA, listB) match {
      case (Nil, Nil) => a
      case _ if pos >= listA.length => a
      case (_ :: tailA, _ :: tailB) => aux(pos + 1, tailA, tailB, listA(pos) == listB(pos))
    }

    aux(0, list, list.reverse, a = true)
  }

  override def last[A](list: List[A]): Option[A] = {
    @tailrec
    def aux(l: List[A], element: Option[A]) : Option[A] = l match {
      case Nil => element
      case x :: tail => aux(tail, Option(x))
    }

    aux(list, None)
  }

  override def length[A](list: List[A]): Int = {
    @tailrec
    def aux(l: List[A], length: Int) : Int = l match {
      case Nil => length
      case _ :: tail => aux(tail, length + 1)
    }

    aux(list, 0)
  }

  override def nth[A](n: Int, list: List[A]): Option[A] = {
    @tailrec
    def aux(pos: Int, l: List[A], element: Option[A]) : Option[A] = l match {
      case Nil => element
      case _ if n == pos => l.headOption
      case x :: tail => aux(pos + 1, tail, None)
    }

    aux(0, list, None)
  }

  override def penultimate[A](list: List[A]): Option[A] = {
    @tailrec
    def aux(l: List[A], element: Option[A]) : Option[A] = l match {
      case Nil => element
      case _ :: Nil => element
      case x :: tail => aux(tail, Option(x))
    }

    aux(list, None)
  }

  override def range(from: Int, to: Int): List[Int] = ???

  override def removeAt[A](index: Int, list: List[A]): List[A] = ???

  override def reverse[A](list: List[A]): List[A] = ???
}
