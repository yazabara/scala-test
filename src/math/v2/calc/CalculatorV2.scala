package math.v2.calc

import math.v2.{Adder, Multiplyer}

/**
  * @author Yaroslav Zabara
  */
trait CalculatorV2[K] extends Adder[K] with Multiplyer[K] {

  //constructor here
  var typeCalculator: String = CalculatorType.UNKNOWN
}
