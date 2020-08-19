package leetcode

object LongestCommonPrefix extends App {
  def longestCommonPrefix(strs: Array[String]): String = {
    strs.length match {
      case 0 => ""
      case 1 => strs(0)
      case _ => {
        println("max: " + strs.max)
        println("min: " + strs.min)
        strs.max.zip(strs.min).takeWhile(v => v._1 == v._2).unzip._1.mkString
        // min and max sorts the elements first - comparing between the first and last is enough
        // the difference between those is the longest common prefix - middle elements doesn't matter
      }
    }
  }

  println(longestCommonPrefix(Array("flower", "frow", "flight")))
}
