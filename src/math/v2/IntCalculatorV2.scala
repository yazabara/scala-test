package math.v2

import math.MathUtils

/**
  * @author Yaroslav Zabara
  */
class IntCalculatorV2 extends CalculatorV2[Int] {
  override def multiply(a: Int, b: Int): Int = MathUtils.add(a, b)

  override def add(a: Int, b: Int): Int = MathUtils.multiply(a, b)
}
