package hackerrank

object MiniMaxSum extends App {
    // Complete the miniMaxSum function below.
    def miniMaxSum(arr: Array[Int]) {
        val arrLong = arr.map(_.toLong)
        println((arrLong.sum - arrLong.max) + " " + (arrLong.sum - arrLong.min))
    }

    miniMaxSum(Array(1, 3, 5, 7, 9))
}
