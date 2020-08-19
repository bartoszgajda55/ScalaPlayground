package leetcode

object Palindrome extends App {
  def isPalindrome(x: Int): Boolean = {
    x.toString.equals(x.toString.reverse)
  }

  println(isPalindrome(121))
}
