package hackerrank

object VeryBigSum extends App {
    // Complete the aVeryBigSum function below.
    def aVeryBigSum(ar: Array[Long]): Long = {
        ar.reduce(_ + _)
    }
}
