package com.camisnew.quiz.model

class Question(
    var questionDescription: String,
    var option1: String,
    var option2: String,
    var option3: String,
    var option4: String,
    var rightAnswer: String) {

    fun isThisCorrect(selectedOption: String) : Boolean {
       return selectedOption == rightAnswer
    }
}