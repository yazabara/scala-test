package math

/**
  * @author Yaroslav Zabara
  */
class DoubleCalculator extends Calculator{

  typeCalculator = CalculatorType.Double;

  def add(a: Double, b: Double): Double = a + b

  def multiply(a: Double, b: Double): Double = a * b
}
