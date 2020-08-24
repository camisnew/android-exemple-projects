package com.camisnew.quiz.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camisnew.quiz.R
import com.camisnew.quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_question1.*

class Question1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        val question = Quiz.questions[0]
        var selectedOption : String ? = null

        question1Description.text = question.questionDescription
        question1Option1.text = question.option1
        question1Option2.text = question.option2
        question1Option3.text = question.option3
        question1Option4.text = question.option4

        question1Option1.setOnClickListener {
            selectedOption = question.option1
        }
        question1Option2.setOnClickListener {
            selectedOption = question.option2
        }
        question1Option3.setOnClickListener {
            selectedOption = question.option3
        }
        question1Option4.setOnClickListener {
            selectedOption = question.option4
        }

        next.setOnClickListener {
            Quiz.checkOption(selectedOption.toString(), question, this@Question1 )
            Thread.sleep(1200)
            startActivity(Intent(this@Question1, Question2::class.java))
        }
    }
}