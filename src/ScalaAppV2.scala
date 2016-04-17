import math.v2.calc.{CalculatorType, CalculatorV2, DoubleCalculatorV2, IntCalculatorV2}

/**
  * @author Yaroslav Zabara
  */
object ScalaAppV2 {

  def main(args: Array[String]) = {
    val calculator = new IntCalculatorV2
    val calculator2 = new DoubleCalculatorV2
    println(calculator.add(1, 2))
    println(calculator.multiply(2, 2))
    //
    println(calcType(calculator))
    println(calcType(calculator2))
    //
    val intVal = 1
    val mathVal = intVal match {
      case 1 => "one"
      case 2 => "two"
      case _ => "some other number"
    }
    println(intVal + " : " + mathVal)
  }
  
  def calcType[K](calc: CalculatorV2[K]): String = {
    calc.typeCalculator match {
      case CalculatorType.INTEGER => "It's integer calculator"
      case CalculatorType.DOUBLE => "It's double calculator"
      case _ => "unknown"
    }
  }

}
