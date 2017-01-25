package com.kapx.scala.basics

object HelloWorld {
    def main(args: Array[String]) {
        val arg: String = "Scala";
        val result1 = sayHello1(arg);
        println(result1);
        
        val result2 = sayHello2("Java");
        println(result2);
        
        printMessage("Calling a function...");
    }

    def sayHello1(arg: String): String = {
        return "Hello ! " + arg;
    }

    def sayHello2(arg: String) = {
        "Hello ! " + arg;
    }
    
    // void function (Unit represent function is void, doesn't return anything...
    def printMessage(arg : String) : Unit = {
        println (arg);
    }
}