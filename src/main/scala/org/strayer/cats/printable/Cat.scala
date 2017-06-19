package org.strayer.cats.printable

/**
  * Created by Jon on 6/13/2017.
  */
final case class Cat(name: String, age: Int, color: String)
import PrintableSyntax._

class PrintableCat extends Printable[Cat] {
  override def format(value: Cat): String =
    
    Printable.format(value.name, PrintableInstances.ps) + " is a " +
    Printable.format(value.age, PrintableInstances.pi) + " year-old " +
    Printable.format(value.color, PrintableInstances.ps) + " cat."
}

object PrintableCat {
  def main(args: Array[String]) = {
    val cat = Cat("George", 3, "tabby")
    implicit val  printer = new PrintableCat
    cat.print
  }
}