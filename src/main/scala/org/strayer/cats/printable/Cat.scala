package org.strayer.cats.printable

/**
  * Created by Jon on 6/13/2017.
  */
final case class Cat(name: String, age: Int, color: String)

class PrintableCat extends Printable[Cat] {
  override def format(value: Cat): String =
    PrintableWith.formatAccepts(value.name, PrintableInstances.ps) + " is a " +
    PrintableWith.formatAccepts(value.age, PrintableInstances.pi) + " year-old " +
    PrintableWith.formatAccepts(value.color, PrintableInstances.ps) + " cat."
}

object PrintableCat {
  def main(args: Array[String]) = {
    val cat = Cat("George", 3, "tabby")
    val printer = new PrintableCat
    println(printer.format(cat))
  }
}