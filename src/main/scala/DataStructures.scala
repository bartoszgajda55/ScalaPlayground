object DataStructures {
  def main(args: Array[String]): Unit = {
    // Tuples - immutable lists
    val captainStuff = ("Picard", "Enterprise-D", "NCC-1701-D")
    println(captainStuff)
    // You refer to individual fields with their ONE-BASED index:
    println(captainStuff._1)
    println(captainStuff._2)
    println(captainStuff._3)

    // Key value pairs with ->
    val picardsShip = "Picard" -> "Enterprise-D"
    println(picardsShip._2)

    // Tuples can mix different types
    val differentTupleTypes = ("Kirk", 1964, true)

    // Lists
    // An actual collection object that ahs more functionality
    val shipList = List("Enterprise", "Defiant", "Voyager", "Deep Space Nine")
    // Access individual members using () with ZERO-BASED index
    print(shipList(0))
    print(shipList(1))
    print(shipList(2))

    // Head and Tail give you first item, and the remaining ones
    println(shipList.head)
    println(shipList.tail)

    // Iterating through lists
    for (ship <- shipList) {
      println(ship)
    }

    // map() function to transforms a list
    val backwardsShips = shipList.map((ship: String) => ship.reverse)
    println(backwardsShips)

    // reduce() can be used to combine together all the items in a collection
    val numbersList = List(1, 2, 3, 4, 5)
    val sum = numbersList.reduce((x: Int, y: Int) => x + y)
    println(sum)

    // filter() can remove stuff you don't want. Wildcard syntax is introduced
    val iHateFives = numbersList.filter((x: Int) => x != 5)
    val iHateThrees = numbersList.filter(_ != 3)

    // Concatenating lists
    val moreNumbers = List(6, 7, 8)
    val lotsOfNumbers = numbersList ++ moreNumbers

    // More List fun
    val reversed = numbersList.reverse
    val sorted = numbersList.sorted
    val lotsOfDuplicates = numbersList ++ numbersList
    val distinctValues = lotsOfDuplicates.distinct
    val maxValue = numbersList.max
    val total = numbersList.sum
    val hasThree = iHateThrees.contains(3)

    // Maps
    val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D", "Sisko" -> "Deep Space Nine", "Janeway" -> "Voyager")
    println(shipMap("Janeway"))
    println(shipMap.contains("Archer"))

    val archersShip = util.Try(shipMap("Archer")) getOrElse "Unknown"
    println(archersShip)
  }
}
