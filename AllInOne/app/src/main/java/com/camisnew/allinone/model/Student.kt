package com.camisnew.allinone.model

class Student (val name: String, private val grade1: Double, private val grade2: Double) {

    fun calculateAverage(): Double {
        return (this.grade1 + this.grade2)/2
    }
}