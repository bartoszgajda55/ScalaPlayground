package hackerrank

object CompareTheTriplets extends App {

    // Complete the compareTriplets function below.
    def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
        var aScore = 0
        var bScore = 0

        a zip b foreach { (tuple => tuple match {
            case (a, b) if a > b => aScore += 1
            case (a, b) if a < b => bScore += 1
            case _ =>
        })}

        Array(aScore, bScore)
    }

    println(compareTriplets(Array(5, 6, 7), Array(3, 6, 10)).mkString)
}
