package com.kapx.scala.basics

object WhileLoop {
    def main(array: Array[String]) {
        var languages = Array("Java", "Scala", "Groovy", "Closure", "Python")

        var index: Int = 0;
        while (index < 5) {
            var language = languages(index);
            println(language);
            index = index + 1;
        }
    }
}