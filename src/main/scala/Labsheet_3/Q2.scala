package Labsheet_3

import scala.io.StdIn.readLine

object Q2 {

  def filstr(x: List[String]): List[String] = x.filter(_.length > 5)

  def main(args: Array[String]): Unit ={
    val input= List("mercedes", "volvo", "jaguar", "mini", "porsche")
    val out = filstr(input)
    printf("The strings which are greater than 5 are %s",out)

  }
}
