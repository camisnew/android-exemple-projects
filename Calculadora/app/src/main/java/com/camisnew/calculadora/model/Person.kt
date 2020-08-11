package com.camisnew.calculadora.model

public class Person (val name :String, val profession: String ) {

    fun calculateSuccessChance(): Int = (0..100).random();

    override fun toString(): String = "Nome: ${this.name}\n Profissão: ${this.profession}\nSua chance de sucesso é ${calculateSuccessChance()}%";
}