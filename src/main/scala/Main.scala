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
    println(f"Pi is about $piSinglePrecision%.3f")
    println(f"Zero paddin on the left: $numberOne%05d")

    // Substituting in variables
    println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")

    // Substituting expressions (with curly brackets)
    println(s"The s prefix isn't limited to variables like ${1+2}")

    // Using regular expressions
    val theUltimateAnswer: String = "To life, the universe, and everything is 42."
    val pattern = """.* ([\d]+).""".r
    val pattern(answerString) = theUltimateAnswer
    val answer = answerString.toInt
    println(answer)

    // Dealing with booleans
    val isGreater = 1 > 2
    val isLesser = 1 < 2
    val impossible = isGreater & isLesser // Better safety
    val anotherWay = isGreater && isLesser // Bail out earlier

    val picard: String = "Picard"
    val bestCaptain: String = "Picard"
    val isBest: Boolean = picard == bestCaptain

    // EXERCISE
    // Write some code that takes the value of pi, doubles it and then prints it withing a string with
    // three decimal places of precision to the right
    val secondPi: Float = 3.14159265f
    val doubledPi = secondPi * 2
    println(f"The doubled Pi equals: $doubledPi%.3f")
  }
}