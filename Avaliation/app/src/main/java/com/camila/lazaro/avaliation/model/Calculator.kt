package com.camila.lazaro.avaliation.model

class Calculator (var number1 : Double,var number2 : Double) {
    override fun toString(): String {
        return super.toString()
    }
    fun plus(): Double? {
        return (this.number1 + this.number2)
    }
    fun subtract(): Double? {
        return (this.number1 - this.number2)
    }
    fun times(): Double? {
        return (this.number1 * this.number2)
    }
    fun division(): Double? {
        return (this.number1 / this.number2)
    }

}