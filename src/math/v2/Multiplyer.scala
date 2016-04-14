package math.v2

/**
  * @author Yaroslav Zabara
  */
trait Multiplyer[K] {
  def multiply(a: K, b: K): K
}
