package com.kapx.scala.basics

object VarArgsDemo {

    def concat(args: String*) : Unit = {
        for (i <- 0 to (args.length - 1)) {
            print(args(i))
        }
    }

    def sum(nums: Int*): Int = {
        var result = 0;
        for (i <- 0 to (nums.length - 1)) {
            result += nums(i)
        }
        result
    }

    def main(args: Array[String]): Unit = {
        val result = sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
        println(result)

        concat("Hello", " ", "Scala")
    }
}
