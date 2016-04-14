package math.v1

/**
  * @author Yaroslav Zabara
  */
class DoubleCalculatorV1 extends CalculatorV1{

  typeCalculator = CalculatorType.Double;

  def add(a: Double, b: Double): Double = a + b

  def multiply(a: Double, b: Double): Double = a * b
}
