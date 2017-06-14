package org.strayer.cats.printable



/**
  * Created by Jon on 6/13/2017.
  */
class Printable[A] {
    def format(value: A): String = ???
}

object PrintableInstances {

  val pi = new Printable[Int] {
    override def format(value: Int): String = value.toString
  }

  val ps = new Printable[String] {
    override def format(value: String): String = value
  }
}

object PrintableWith {
  def formatAccepts[A](value: A, printer: Printable[A]) : String = printer.format(value)
  def printAccepts[A](value: A, printer: Printable[A]) : Unit = println(formatAccepts(value, printer))
}

object PrintableSyntax {
  implicit class PrintOps[A](value: A)  {
    def formatAccepts

  }
}