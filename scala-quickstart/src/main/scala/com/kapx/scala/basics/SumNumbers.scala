package com.kapx.scala.basics

object SumNumbers {
    def sum(numbers : Array[Int]) : Int = {
        var result = 0;
        for (i <- 0 to (numbers.length - 1)) {
            result += numbers(i)
        }
        result
    }

    def main(args: Array[String]): Unit = {
        val numbers = Array(1, 2, 3, 4, 5)
        println(sum(numbers))
    }
}
