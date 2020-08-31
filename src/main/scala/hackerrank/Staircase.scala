package hackerrank

import scala.collection.mutable

object Staircase extends App {
  def staircase(n: Int) {
    val array = mutable.ArrayBuffer.fill(n)(' ')

    (n - 1 to 0 by -1) foreach { x =>
      array(x) = '#'
      println(array.mkString(""))
    }
  }

  staircase(6)
}
