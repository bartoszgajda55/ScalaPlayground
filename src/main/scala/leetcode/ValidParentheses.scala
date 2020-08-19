package leetcode

import scala.collection.mutable

object ValidParentheses extends App {
  val matchingChars = Map[Char, Char](
    '[' -> ']',
    '(' -> ')',
    '{' -> '}'
  )

  def isValid(s: String): Boolean = {
    val stack: mutable.Stack[Char] = mutable.Stack[Char]()

    s.foreach((c: Char) => {
      if (stack.isEmpty) {
        stack.push(c)
      } else if (c.equals(matchingChars.get(stack.head).getOrElse(""))) {
        stack.pop()
      } else {
        stack.push(c)
      }
    })

    stack.isEmpty
  }

  println(isValid("()[]{}"))
  println(isValid("([)]"))
}
