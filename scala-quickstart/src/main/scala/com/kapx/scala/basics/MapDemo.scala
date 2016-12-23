package com.kapx.scala.basics

object MapDemo extends App {
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    capital += ("Ireland" -> "Dublin")
    println(capital("Ireland"))
}
