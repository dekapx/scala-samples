package com.kapx.scala.basics

import org.scalatest.{BeforeAndAfter, FunSuite}

class CalcTest extends FunSuite with BeforeAndAfter {
    var calc: Calc = _

    before {
        calc = new Calc
    }

    test("with given two numbers expect summation") {
        val actual = calc.sum(10, 15)
        assert(actual == 25)
    }

    test("with given all numbers expect summation") {
        val actual = calc.sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assert(actual == 45)
    }

    test("with given two numbers expect subtraction") {
        val actual = calc.subtract(15, 5)
        assert(actual == 10)
    }

    test("with given two numbers expect multiplication") {
        val actual = calc.multiply(5, 3)
        assert(actual == 15)
    }

    test("with given two numbers expect division") {
        val actual = calc.divide(15, 3)
        assert(actual == 5)
    }
}


