package catsbook.exercises.chapter3
import BranchingFunctor._
import cats.syntax.all._

object Chapter3 extends App {

  val x: Tree[Int] = Tree.branch(Tree.leaf[Int](5), Tree.leaf[Int](6))

  println(x.map(_ * 2))
}
