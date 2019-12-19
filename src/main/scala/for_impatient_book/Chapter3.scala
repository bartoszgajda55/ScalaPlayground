package for_impatient_book

object Chapter3 extends App {
  // 1. Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
  val arr = Array((0 until 5).toList)
  // 2. Write a loop that swaps adjacent elements of an array of integers. For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
  val arr2 = (1 to 5).toArray
  val swappedArr2 = arr2.grouped(2).flatMap(_.reverse).toArray
  println(swappedArr2.mkString(", "))
}
