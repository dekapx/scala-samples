package com.kapx.scala.basics

object Square {
    def sq_1(x: Long): Long = {
        x * x;
    }

    def sq_2(x: Long) = {
        x * x;
    }

    def main(args: Array[String]): Unit = {
        val l1 : Long = 2
        println(sq_1(l1))

        val l2 = 3L
        println(sq_2(l2))
    }
}
