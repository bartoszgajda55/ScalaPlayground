package leetcode

object MegeTwoSortedLists extends App {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) return l2
    if (l2 == null) return l1
    if (l1.x < l2.x) {
      l1.next = mergeTwoLists(l1.next, l2)
      l1
    } else {
      l2.next = mergeTwoLists(l1, l2.next)
      l2
    }
  }

  val l3 = new ListNode(4)
  val l2 = new ListNode(2, l3)
  val l1 = new ListNode(1, l2)

  val l6 = new ListNode(4)
  val l5 = new ListNode(3, l6)
  val l4 = new ListNode(1, l5)

  println(mergeTwoLists(l1, l4))
}
