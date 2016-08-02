package com.kapx.scala.basics

object MapDemo extends App {
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))
}
