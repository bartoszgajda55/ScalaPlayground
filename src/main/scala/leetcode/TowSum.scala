package leetcode

object TowSum extends App {
  def twoSum(nums: Array[Int], target: Int) = {
    nums.zipWithIndex
      .filter(
        x =>
          (nums.take(nums.indexOf(x._1)) ++ nums.drop(nums.indexOf(x._1) + 1))
            .contains(target - x._1)
      )
      .map(_._2)
  }

  val nums = Array(3, 3)
  val target = 6
  println(twoSum(nums, target).mkString(", "))
}
