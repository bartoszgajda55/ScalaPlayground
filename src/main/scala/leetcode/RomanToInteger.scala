package leetcode

object RomanToInteger extends App {
  val romanNumeralAsInteger = Map[Char, Int](
    'V' -> 5,
    'X' -> 10,
    'I' -> 1,
    'L' -> 50,
    'C' -> 100,
    'D' -> 500,
    'M' -> 1000
  )

  def romanToInt(s: String) = {
    var result: Int = 0
    val stringAsArray: Array[Char] = s.toArray
    var i = 0

    while (i < stringAsArray.length - 1) {
      if (romanNumeralAsInteger
            .get(stringAsArray(i))
            .get < romanNumeralAsInteger
            .get(stringAsArray(i + 1))
            .get) {
        result -= romanNumeralAsInteger
          .get(stringAsArray(i))
          .get
      } else {
        result += romanNumeralAsInteger.get(stringAsArray(i)).get
      }
      i += 1
    }
    result += romanNumeralAsInteger.get(stringAsArray.last).get
    result
  }

  println(romanToInt("IV"))
}
