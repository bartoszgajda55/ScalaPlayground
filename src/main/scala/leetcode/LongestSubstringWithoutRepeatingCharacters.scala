package leetcode

import collection.mutable

object LongestSubstringWithoutRepeatingCharacters extends App {
  def lengthOfLongestSubstring(s: String): Int = {
      val pairs = mutable.Map[Char, Int]()
      var left = 0
      var longest = 0

      for((char, right) <- s.zipWithIndex) {
          pairs.get(char).foreach(i => left = math.max(left, i + 1))
          longest = math.max(longest, (right - left) + 1)
          pairs.put(char, right)
      }
      longest
  }

  println(lengthOfLongestSubstring("abcabcbb"))
  println(lengthOfLongestSubstring("bbbbb"))
  println(lengthOfLongestSubstring("pwwkew"))
}
