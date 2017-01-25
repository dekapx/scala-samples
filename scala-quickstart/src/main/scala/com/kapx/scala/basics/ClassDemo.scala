package com.kapx.scala.basics

class Person(arg : String) {
    var name : String = arg;
    
    def whoAmI() = {
        val voiceOf = new VoiceOf(this);
        voiceOf.hi();
        voiceOf.hi(this);
        voiceOf.yourName();
    }
}

class VoiceOf(speaker: Person) {
    def hi() = {
        println("Hello!")
    }
    
    def hi(to: Person) = {
        println("Hi " + to.name)
    }
    
    def yourName() = {
        println("My name is " + speaker.name)
    }
}

object ClassDemo {
    def main(args : Array[String]) {
        val person = new Person("DeKapx");
        person.whoAmI();
    }
}