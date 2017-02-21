package com.kapx.scala.basics

import org.junit.Assert._
import org.junit._

@Test
class HelloWorldTest {

    @Before
    def setup(): Unit = {
    }

    @Test
    def sayHello_withValidInput_returnValidOutput(): Unit = {
        val objUnderTest = new HelloWorld()
        val actual = objUnderTest.sayHello("DeKapx")
        val expected = "Hello ! DeKapx"
        assertEquals(expected, actual)
    }

}


