package scala_book

object Hello extends App {
  println("Hello 123")

  // immutable
  val x = 1
  // mutable
  var y = 0
  // declare type explicitly
  val s: String = "a string"
  val z: Int = 123

  // standard if else block
  if (z == 123) {
    println("Its 123")
  } else if (z == 124) {
    println("Its 124")
  } else {
    println("Its other number")
  }

  // if else returns a value, can be used as ternary
  val j = if (z > 123) 1 else 0
  println(j)

  // match is like switch
  val result = j match {
    case 1 => "one"
    case 2 => "two"
    case _ => "zero"
  }

  val bool: Boolean = false
  val booleanAsString = bool match {
    case true  => "true"
    case false => "false"
  }

  // for loops and expressions
  for (i <- 0 to 5) println(i)
  for (i <- 0 to 10 by 2) println(i)

  val k = for (i <- 1 to 5) yield i * 2
  println(k)

  val fruits = List("apple", "banana", "lime", "orange")
  val fruitLengths = for {
    f <- fruits
    if f.length > 4
  } yield f.length
}
