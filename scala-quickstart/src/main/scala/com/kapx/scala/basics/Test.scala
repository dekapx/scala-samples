package com.kapx.scala.basics

object Test {
    def main(args: Array[String]): Unit = {
        val increment = (x: Int) => x + 1
        var output = increment(1)
        println("Increment: " + output)


        val sum = (x: Int, y: Int) => (x + y)
        output = sum(5, 7)
        println("Sum: " + output)

        val subtract = (x: Int, y: Int) => (x - y)
        output = subtract(5, 3)
        println("Subtract: " + output)
    }
}
