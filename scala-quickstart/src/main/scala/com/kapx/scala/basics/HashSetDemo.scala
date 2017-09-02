package com.kapx.scala.basics

import scala.collection.mutable._

class Student(name: String, city: String) {
    def getName() = {
        name
    }

    def getCity() = {
        city
    }
}

object HashSetDemo {
    def findStudentByCity(students: List[Student], city: String): Unit = {
    }


    def createStudents(): List[Student] = {
        val students: List[Student] = List(
            new Student("Steve", "Athlone"),
            new Student("James", "Dublin"),
            new Student("Mark", "Galway"),
            new Student("Brian", "Cork"))
        students
    }

    def main(args: Array[String]): Unit = {
        val students = createStudents()
        findStudentByCity(students, "Athlone")
    }

}
