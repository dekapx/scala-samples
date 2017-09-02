package com.kapx.scala.basics

object IfElseDemo {
    def main(args: Array[String]): Unit = {
        println(ticketPrice(10))
        println(ticketPrice(40))
    }

    def ticketPrice(age: Int): Int = {
        if (age < 13)
            15
        else
            25
    }
}
