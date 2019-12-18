package scala_book

object Classes extends App {
  val p = new Person("John", "Doe")
  p.firstName = "Mark"
  val DefaultCrustSize = 12
  val DefaultCrustType = "THIN"

  val p1 = new Pizza(DefaultCrustSize, DefaultCrustType)
  val p2 = new Pizza(DefaultCrustSize)
  val p3 = new Pizza(DefaultCrustType)
  val p4 = new Pizza

  val s1 = new Socket()
  val s2 = new Socket(1000)
  val s3 = new Socket(4000, 6000)

  // Named params
  val s4 = new Socket(timeout = 2000, linger = 3000)
}

class Person(var firstName: String, var lastName: String)

// Using auxillary class constructors
class Pizza(var crustSize: Int, var crustType: String) {
  val DefaultCrustSize = 12
  val DefaultCrustType = "THIN"

  def this(crustSize: Int) {
    this(crustSize, DefaultCrustType)
  }

  def this(crustType: String) {
    this(DefaultCrustSize, crustType)
  }

  def this() {
    this(DefaultCrustSize, DefaultCrustType)
  }
}

// Constructor default params
class Socket(var timeout: Int = 2000, var linger: Int = 3000) {
  override def toString = s"timeout: $timeout, linger: $linger"
}

// Enum
sealed trait DayOfWeek
case object Sunday extends DayOfWeek
case object Monday extends DayOfWeek
case object Tuesday extends DayOfWeek
case object Wednesday extends DayOfWeek
case object Thursday extends DayOfWeek
case object Friday extends DayOfWeek
case object Saturday extends DayOfWeek
