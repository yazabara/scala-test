package math.v2

/**
  * @author Yaroslav Zabara
  */
class DoubleCalculatorV2 extends CalculatorV2[Double] {
  override def multiply(a: Double, b: Double): Double = a + b

  override def add(a: Double, b: Double): Double = a * b
}
