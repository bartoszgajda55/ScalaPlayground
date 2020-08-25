package hackerrank

import java.time
import java.time.LocalTime
import java.time.format.DateTimeFormatter

object TimeConversion extends App {
    def timeConversion(s: String): String = {
        LocalTime.parse(s.toLowerCase(), DateTimeFormatter.ofPattern("hh:mm:ssa")).format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    }

    println(timeConversion("07:05:45PM"))
}
