package com.kapx.scala.basics

object FindMaxFunction extends App {
    // Function definitions start with 'def' keyword.
    def max(x:Int, y:Int) : Int = {
        if (x > y) x
        else y
    }

    val result = max(5, 7)
    println(result)
}
