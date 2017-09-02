package com.kapx.scala.basics

trait HelloWorldTrait {
    def sayHello(arg: String) : String
}

class HelloWorld extends HelloWorldTrait{
    def sayHello(arg: String) : String = {
        return "Hello ! " + arg;
    }
}
