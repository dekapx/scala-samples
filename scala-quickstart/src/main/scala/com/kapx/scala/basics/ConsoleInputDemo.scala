package com.kapx.scala.basics

import io.StdIn._

object ConsoleInputDemo {
    def main(args: Array[String]) : Unit = {
        val age = readInt()
        println("Ticket price is: " + ticketPrice(age))
    }

    def ticketPrice(age: Int): Int = {
        if (age < 13)
            15
        else
            25
    }
}
