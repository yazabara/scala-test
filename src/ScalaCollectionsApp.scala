/**
  * @author Yaroslav Zabara
  */
object ScalaCollectionsApp {
  def main(args: Array[String]) = {
    val numbers = List(1, 2, 3, 4)
    println(numbers)
    //
    val set1 = Set(1, 1, 2)
    println(set1)
    //
    val hostPort = ("localhost", 80)
    println(hostPort._1)
    println(hostPort._2)
    println(hostPort)
  }
}
