package leetcode

object ReverseInteger extends App {
  def reverse(x: Int) = {
    var originalX = x
    var reversedX: Long = 0
    while (originalX != 0) {
      reversedX = reversedX * 10 + originalX % 10
      if (reversedX > Int.MaxValue || reversedX < Int.MinValue) {
        reversedX = 0
      }
      originalX = originalX / 10
    }
    reversedX.toInt
  }

  println(reverse(-123))
}
