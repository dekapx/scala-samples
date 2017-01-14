package com.kapx.scala.basics


class Calculator {
    def sum(num1: Int, num2: Int) {
        val result = num1 + num2;
        println("Result: " + result);
    }
}

object Calc {
    def main(args: Array[String]): Unit = {
        val calc = new Calculator();
        calc.sum(10, 20);
    }
}
