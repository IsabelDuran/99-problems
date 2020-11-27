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

    aux(0, list, Answers.reverse(list), a = true)
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

  override def range(from: Int, to: Int): List[Int] = {
    @tailrec
    def aux(a: Int, b: Int, list: List[Int]) : List[Int] = (a,b) match {
      case _ if b < a => list
      case _ if a == b => list :+ a
      case (a, b) => aux(a + 1, b, list :+ a)
    }

    aux(from, to, Nil)
  }

  override def removeAt[A](index: Int, list: List[A]): List[A] = list match {
    case Nil => throw new NoSuchElementException("The list is empty")
    case _ if index > list.length => throw new NoSuchElementException("The index is out of range")
    case x :: tail if index == 0 => tail
    case x :: tail => x :: removeAt(index - 1, tail)
  }

  override def reverse[A](list: List[A]): List[A] = {
    @tailrec
    def aux(listA: List[A], listB: List[A]) : List[A] = listA match {
      case Nil => listB
      case x :: tail => aux(tail, x +: listB)
    }

    aux(list, Nil)
  }
}
