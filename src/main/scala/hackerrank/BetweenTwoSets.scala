package hackerrank

object BetweenTwoSets extends App {
  def getTotalX(a: Array[Int], b: Array[Int]): Int = {
    def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
    def lcm(a: Int, b: Int) = (a * b).abs / gcd(a, b)

    val alcm = a.reduce(lcm(_, _))
    val bgcd = b.reduce(gcd(_, _))
    (1 to bgcd / alcm).count(i => bgcd % (i * alcm) == 0)
  }

  println(getTotalX(Array(2, 3), Array(16, 32, 96)))
}
