package com.kapx.scala.basics

import org.scalatest.{BeforeAndAfter, FunSuite}

class HelloWorldTest extends FunSuite with BeforeAndAfter {
    var helloWorld: HelloWorld = _
    before {
        helloWorld = new HelloWorld
    }

    test("With given input expect formatted output") {
        assert(helloWorld.sayHello("DeKapx").equals("Hello ! DeKapx"))
    }
}


