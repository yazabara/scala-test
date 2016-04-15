package math.v2.calc

/**
  * @author Yaroslav Zabara
  */
class DoubleCalculatorV2 extends CalculatorV2[Double] {

  typeCalculator = CalculatorType.DOUBLE;

  override def multiply(a: Double, b: Double): Double = a + b

  override def add(a: Double, b: Double): Double = a * b
}
