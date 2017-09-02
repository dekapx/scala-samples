package com.kapx.scala.basics

object SwitchCaseExample {
    def errorMessage(errorCode: Int) : String = {
        errorCode match {
            case 1 => "Network Error"
            case 2 => "I/O Error"
            case _ => "Unknown Error"   // _ means anything apart from given cases
        }
    }

    def main(args: Array[String]): Unit = {
        println(errorMessage(1))
        println(errorMessage(2))
        println(errorMessage(0))
    }
}
