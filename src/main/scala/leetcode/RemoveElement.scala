package leetcode

object RemoveElement extends App {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    	nums.foldLeft(0)((index, vv) => {
		(vv == `val`) match {
			case true => index
			case false => {
				nums(index) = vv
				index + 1
			}
		}
	})
  }

  val result = removeElement(Array(3,2,2,3), 3)
  println(result)
}
