object FlowControl {
  def main(args: Array[String]): Unit = {
    // FLow control
    if (1 > 3)
      println("impossible")
    else
      println("possible")

    // Matching - like switch in other languages:
    val number = 3
    number match {
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
      case _ => println("Deafult")
    }

    // For loops
    for (x <- 1 to 4) {
      val squared = x * x
      println(squared)
    }

    // While loops
    var x = 10
    while (x >= 10) {
      println(x)
      x -= 1
    }

    // Do While
    x = 0
    do {
      println(x)
      x += 1
    } while (x <= 10)

    // Expressions
    // "Returns" the final value in a block automatically
    {val x = 10; x + 20}
    println({val x = 10; x + 20})

  }
}
