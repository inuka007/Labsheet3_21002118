package Labsheet_3

import scala.io.StdIn.readLine

object Q1 {

  def rev(str: String):String = {
    if(str.isEmpty)
      ""
    else if(str.length == 1)
      return str;
    else
      return rev(str.tail) + str.head
  }

  def main(args: Array[String]): Unit = {
    val input_1: String = readLine("Enter the string that you need to reverse: ");
    printf("Reversed String: %s",rev(input_1));
  }

}
