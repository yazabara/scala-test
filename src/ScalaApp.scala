import math.{Calculator, DoubleCalculator, MathUtils}

/**
  * @author Yaroslav Zabara
  */
object ScalaApp {

  def main(args: Array[String]) = {
    println("Hello")
    //
    val addOne = (x: Int) => x + 1
    println(addOne(2))
    println(addOne)
    //
    println(MathUtils.addOne(1))
    val mtpl = MathUtils.multiply(1, _:Int)
    println(MathUtils.multiply(3, 2))
    println(mtpl)
    println(mtpl(2))
    //
    val calc = new Calculator
    val doubleCalc = new DoubleCalculator
    println( calc.add(1,2) )
    println( calc.typeCalculator )
    println( doubleCalc.add(1d,2d))
    println( doubleCalc.typeCalculator)
  }
}
