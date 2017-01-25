package com.kapx.scala.basics

object Calc {
    def main(args: Array[String]) {
        var result: Int = 0;
        result = sum(5, 7);
        println("sum(5, 7) = " + result);

        result = subtract(12, 7);
        println("subtract(12, 7) = " + result);

        result = multiple(3, 5);
        println("multiple(3, 5) = " + result);

        result = divide(20, 5);
        println("divide(20, 5) = " + result);
    }

    def sum(num1: Int, num2: Int): Int = {
        return (num1 + num2);
    }

    def subtract(num1: Int, num2: Int): Int = {
        return (num1 - num2);
    }

    def multiple(num1: Int, num2: Int): Int = {
        return (num1 * num2);
    }

    def divide(num1: Int, num2: Int): Int = {
        return (num1 / num2);
    }
}
