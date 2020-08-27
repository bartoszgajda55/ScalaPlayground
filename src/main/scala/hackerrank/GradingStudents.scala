package hackerrank

object GradingStudents extends App {
    def gradingStudents(grades: Array[Int]): Array[Int] = {
        grades map { (number: Int) => {
            val lowerBound = number / 5
            val upperBound = (lowerBound + 1) * 5

            (upperBound - number) match {
                case x if number < 38 => number
                case x if x < 3 => upperBound
                case _ => number
            }
        } }
    }

    println(gradingStudents(Array(73, 67, 38, 33)).mkString(", "))
}
