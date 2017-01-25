package com.kapx.scala.basics

object OptionalParameters {
    def main(args : Array[String]) {
        printTimes("Scala", 2);
        printTimes("Closure", times = 3);
        printTimes("Java");
    }
    
    def printTimes(msg : String, times : Int = 7) {
        print("\n");
        for (i <- 0 to times) {
            print (msg + " ");
        }
    }
}