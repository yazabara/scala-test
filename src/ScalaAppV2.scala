import math.v2.IntCalculatorV2

/**
  * @author Yaroslav Zabara
  */
object ScalaAppV2 {

  def main(args: Array[String]) = {
    val calculator = new IntCalculatorV2
    println(calculator.add(1, 2))
    println(calculator.multiply(2, 2))
  }
}
