import math.v2.calc.{CalculatorType, CalculatorV2, IntCalculatorV2}

/**
  * @author Yaroslav Zabara
  */
object ScalaAppV2 {

  def main(args: Array[String]) = {
    val calculator = new IntCalculatorV2
    println(calculator.add(1, 2))
    println(calculator.multiply(2, 2))
    //
    //println(calcType(calculator)) //TODO
    //
    val intVal = 1
    val mathVal = intVal match {
      case 1 => "one"
      case 2 => "two"
      case _ => "some other number"
    }
    println(intVal + " : " + mathVal)
  }

  def bigger(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case text: String => text + "s"
    }
  }

  def calcType(calc: CalculatorV2[Any]): String = {
    calc.typeCalculator match {
      case CalculatorType.INTEGER => "It's integer calculator"
      case CalculatorType.DOUBLE => "It's double calculator"
      case _ => "unknown"
    }
  }

}
