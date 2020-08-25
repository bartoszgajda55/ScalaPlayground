package hackerrank

object BirthdayCakeCandles extends App {
     // Complete the birthdayCakeCandles function below.
    def birthdayCakeCandles(ar: Array[Int]): Int = {
        ar.count(_ == ar.max)
        
        // val tuple = ar.foldLeft((0, 0)) { (t, el) =>
        //         if (el > t._1)
        //             (el, 1)
        //         else if (el == t._1)
        //             (t._1, t._2 + 1)
        //         else
        //             t
        //     }
        //     tuple._2
    }


    println(birthdayCakeCandles(Array(3, 2, 1, 3)))
}
