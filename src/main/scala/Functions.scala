object Functions {
  def main(args: Array[String]): Unit = {
    // Format is def <function name>(parameter name: type...): return type =  { expression }
    def squareIt(x: Int): Int = {
      x * x
    }
    def cubeIt(x: Int): Int = {x * x * x}

    println(squareIt(2))
    println(cubeIt(2))

    // Functions can take other functions as parameters
    def transformInt(x: Int, f: Int => Int): Int = {
      f(x)
    }
    val result = transformInt(2, cubeIt)
    println(result)

    // Lambda functions, anonymous functions
    transformInt(3, x => x * x * x)
    transformInt(10, x => x / 2)
    transformInt(2, x => {val y = x * 2; y * y})

    // EXERCISE
    def toUpperCase(x: String): String = {
      x.toUpperCase
    }
    val foo = "foo"
    println(s"foo: ${toUpperCase(foo)}")
  }
}
