package com.kapx.scala.basics

import scala.util.control.Breaks

object WhileLoopBreakable {
    def main(array: Array[String]) {
        var languages = Array("Java", "Scala", "Groovy", "Closure", "Python")

        var index: Int = 0;
        var loop = new Breaks;
        loop.breakable {
            while (index < 5) {
                var language = languages(index);

                if (language.equals("Closure")) {
                    loop.break();
                }

                println(language);
                index = index + 1;
            }
        }

        println("Loop break...");
    }
}