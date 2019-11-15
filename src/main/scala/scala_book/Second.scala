package scala_book

object Second extends App {
  val people = List("Bill", "Candy", "Karen", "Leo", "Regina")
  people.foreach(println)

  // map and for loop
  val ratings = Map(
    "Lady in the Water" -> 3.0,
    "Snakes on a Plane" -> 4.0,
    "You, Me and Dupree" -> 3.5
  )

  for ((name, rating) <- ratings) {
    println(s"Movie: $name, Rating: $rating")
  }

  // for expression
  val nums = Seq(1, 2, 3)
  val doubledNums = for (n <- nums) yield n * 2

  // advanced yield in for expression
  val names = List("_adam", "_david", "_frank")
  val capNames = for (name <- names) yield {
    val nameWithoutUnderscore = name.drop(1)
    val capName = nameWithoutUnderscore.capitalize
    capName
  }
  // alternative to above
  val capNames2 = for (name <- names) yield name.drop(1).capitalize

  // pattern matching with match and if
  val count = 2 match {
    case 1                     => println("one, a lonely number")
    case x if x == 2 || x == 3 => println("two's company, three's a crowd")
    case x if x > 3            => println("4+, that's a party")
    case _                     => println("i'm guessing your number is zero or less")
  }
}
