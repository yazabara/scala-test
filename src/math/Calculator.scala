package math

/**
  * @author Yaroslav Zabara
  */
class Calculator {

  //enum
  object CalculatorType extends Enumeration {
    type CalcType = Value
    val Integer, Double = Value
  }

  //constructor here
  var typeCalculator = CalculatorType.Integer;

  //methods
  def add(a: Int, b: Int): Int = MathUtils.add(a, b)

  def multiply(a: Int, b: Int): Int = MathUtils.multiply(a, b)
}
