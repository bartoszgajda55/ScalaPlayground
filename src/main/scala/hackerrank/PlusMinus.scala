package hackerrank

object PlusMinus extends App {
    // Complete the plusMinus function below.
    def plusMinus(arr: Array[Int]) {
        var negative: Int = 0
        var positive: Int = 0
        var zero: Int = 0

        arr foreach {element: Int => element match {
            case x if x > 0 => positive += 1
            case x if x < 0 => negative += 1
            case _ => zero += 1
        }}

        println(positive.toDouble / arr.length.toDouble)
        println(negative.toDouble / arr.length.toDouble)
        println(zero.toDouble / arr.length.toDouble)
    }

    println(plusMinus(Array(-4, 3, -9, 0, 4, 1)))
}
