object Main {
  def main(args: Array[String]): Unit = {
    // Values are immutable constants.
    val hello: String = "Hello"
    println(hello)

    // Variables are mutable
    var helloThere: String = hello
    helloThere += " There!"
    println(helloThere)

    // Key objective of functional programming is to use immutable objects as often as possible.
    // Try to use operations that transform immutable objects into a new immutable object.
    // For example we could have done the same thing like this:
    val immutableHelloThere = hello + " There!"
    println(immutableHelloThere)

    // Some other types
    val numberOne: Int = 1
    val truth: Boolean = true
    val letterA: Char = 'a'
    val pi: Double = 3.14159265
    val piSinglePrecision: Float = 3.13159265f
    val bigNumber: Long = 1231412412
    val smallNumber: Byte = 123

    // String printing tricks
    println("The mess" + numberOne + truth + letterA + pi + bigNumber)
    println(f"Pi is about $$")
  }
}