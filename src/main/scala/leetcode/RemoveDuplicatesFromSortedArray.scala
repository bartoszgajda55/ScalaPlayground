package leetcode

object RemoveDuplicatesFromSortedArray extends App {
  def removeDuplicates(nums: Array[Int]): Int = {
    nums.distinct.length
  }

  println(removeDuplicates(Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
}
