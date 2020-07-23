package catsbook.exercises.chapter3

import cats.Functor


object BranchingFunctor {

  implicit val treeFunctor: Functor[Tree] = new Functor[Tree] {
    override def map[A, B](fa: Tree[A])(f: A => B): Tree[B] = {
      fa match {
        case Branch(left, right) => Branch(map(left)(f), map(right)(f))
        case Leaf(value) => Leaf[B](f(value))
      }
    }
  }
}
