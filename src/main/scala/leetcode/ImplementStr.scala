package leetcode

object ImplementStr extends App {
    def strStr(haystack: String, needle: String): Int = {
        haystack.indexOf(needle)
    }
    
    println(strStr("hello", "ll"))
    println(strStr("aaaaaa", "bba"))
}
