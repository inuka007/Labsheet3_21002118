package Labsheet_3

import scala.io.StdIn.readFloat

object Q3 {
  def avg(x1: Double, x2: Double): Double = (x1 + x2) / 2.00;

  def round(y: Double): Double = BigDecimal(y).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble;

  def main(args: Array[String]): Unit ={
    print("Enter 2 numbers ")
    val num1: Double = readFloat();
    val num2: Double = readFloat();
    var temp = avg(num1, num2);
    print(round(temp))
  }
}
