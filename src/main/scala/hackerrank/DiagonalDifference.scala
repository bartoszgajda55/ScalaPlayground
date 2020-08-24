package hackerrank

object DiagonalDifference extends App {
      /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    def diagonalDifference(arr: Array[Array[Int]]): Int = {
        var leftToRightSum: Int = 0
        var rightToLeftSum: Int = 0

        var leftIndex = 0
        var rightIndex = arr.length - 1

        for (array <- arr if leftIndex <= arr.length - 1 && rightIndex >= 0) {
            leftToRightSum += array(leftIndex)
            rightToLeftSum += array(rightIndex)
            leftIndex += 1
            rightIndex -= 1
        }

        (leftToRightSum - rightToLeftSum).abs
    }

    val matrix = Array(
        Array(11, 2, 4),
        Array(4, 5, 6),
        Array(10, 8, -12)
    )

    println(diagonalDifference(matrix))
}
