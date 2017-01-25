package com.kapx.scala.basics

import scala.collection.immutable.List

object CollectionDemo {
    def main(args : Array[String]) {
        val languages = List("Java", "Scala", "Python", "Closure", "Haskal");
        
        for(languaue <- languages) {
            println(languaue);
        }
    }
}