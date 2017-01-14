package com.kapx.scala.basics

object VariableDemo {
    val message : String = "This is showcasing scala...";

    def main(args: Array[String]) {
        println(message);

        val num = 10;
        val str = "Hello Scala";
        println(num);
        println(str);

        val (name: String, marks: Int) = Pair("Dave", 25)
        println(name);
        println(marks)
    }
}
