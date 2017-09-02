package com.kapx.scala.basics

object PersonDemo {
    def main(args: Array[String]): Unit = {
        val person = new Person("DeKapx")
        println(person.sayHello())
    }
}
