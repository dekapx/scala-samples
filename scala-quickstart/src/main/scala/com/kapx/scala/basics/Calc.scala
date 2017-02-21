package com.kapx.scala.basics

class Calc {
    def sum(num1: Int, num2: Int): Int = {
        (num1 + num2)
    }

    def sum(nums: Int*): Int = {
        var result = 0;
        for (i <- 0 to (nums.length - 1)) {
            result += nums(i)
        }
        result
    }

    def subtract(num1: Int, num2: Int): Int = {
        (num1 - num2)
    }

    def divide(num1: Int, num2: Int): Int = {
        (num1 / num2)
    }

    def multiply(num1: Int, num2: Int): Int = {
        (num1 * num2)
    }
}
