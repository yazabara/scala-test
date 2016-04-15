import math.v2.CalculatorV2.CalculatorType
import math.v2.{CalculatorV2, IntCalculatorV2}

/**
  * @author Yaroslav Zabara
  */
object ScalaAppV2 {

  def main(args: Array[String]) = {
    val calculator = new IntCalculatorV2
    println(calculator.add(1, 2))
    println(calculator.multiply(2, 2))
    //

    //
    val intVal = 1
    val mathVal = intVal match {
      case 1 => "one"
      case 2 => "two"
      case _ => "some other number"
    }
    println(intVal + " : " + mathVal)
  }

  //def calcType(calc: CalculatorV2): CalculatorType  = calc match {
//    case calc.typeCalculator == CalculatorV2.CalculatorType.Integer =>   ...
//    case calc.typeCalculator == CalculatorV2.CalculatorType.Integer =>   ...
//    case calc.typeCalculator == CalculatorV2.CalculatorType.Integer =>   ...
    //case _ => "unknown"
  //}

}
