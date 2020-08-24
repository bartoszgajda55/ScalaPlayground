package leetcode

object AddTwoNumbers extends App {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    def recursiveHelper(l1: ListNode, l2: ListNode, carry: Int): ListNode = {
      (l1, l2) match {
        case (null, null) => {
          if (carry > 0) {
            new ListNode(carry)
          } else null 
        }
        case (_, null) => {
          val sum: Int = l1.x + carry
          new ListNode(sum % 10, recursiveHelper(l1.next, null, sum / 10))
        }
        case (null, _) => {
          val sum: Int = l2.x + carry
          new ListNode(sum % 10, recursiveHelper(l2.next, null, sum / 10))
        }
        case (_, _) => {
          val sum: Int = l1.x + l2.x + carry
          new ListNode(sum % 10, recursiveHelper(l1.next, l2.next, sum / 10))
        }
      }
    }

    recursiveHelper(l1, l2, 0)
  }

  val l3 = new ListNode(2)
  val l2 = new ListNode(4, l3)
  val l1 = new ListNode(3, l2)

  val l6 = new ListNode(5)
  val l5 = new ListNode(6, l6)
  val l4 = new ListNode(4, l5)

  println(addTwoNumbers(l1, l4))
}
