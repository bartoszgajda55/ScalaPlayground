package for_impatient_book

object Chapter2 extends App {
  // Variable argument
  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  val s = sum(1, 2, 3, 4, 5)
  // Range will not work directly
  //val s2 = sum(1 to 5)
  // Tell compiler to use range as argument sequence
  val s3 = sum(1 to 5: _*)

  // Function that returns Unit is a procedure - no = is needed
  def printSomething() {
    println("something")
  }
}
