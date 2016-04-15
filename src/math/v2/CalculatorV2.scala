package math.v2

/**
  * @author Yaroslav Zabara
  */
trait CalculatorV2[K] extends Adder[K] with Multiplyer[K] {

  //enum
  object CalculatorType extends Enumeration {
    type CalcType = Value
    val UNKNOWN, Integer, Double = Value
  }

  //constructor here
  var typeCalculator = CalculatorType.UNKNOWN;
}
