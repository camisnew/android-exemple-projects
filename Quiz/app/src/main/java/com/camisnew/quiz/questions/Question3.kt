package com.camisnew.quiz.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camisnew.quiz.R
import com.camisnew.quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_question3.*
import kotlinx.android.synthetic.main.activity_question3.next

class Question3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)

        val question = Quiz.questions[2]
        var selectedOption : String ? = null

        question3Description.text = question.questionDescription
        question3Option1.text = question.option1
        question3Option2.text = question.option2
        question3Option3.text = question.option3
        question3Option4.text = question.option4

        question3Option1.setOnClickListener {
            selectedOption = question.option1
        }
        question3Option2.setOnClickListener {
            selectedOption = question.option2
        }
        question3Option3.setOnClickListener {
            selectedOption = question.option3
        }
        question3Option4.setOnClickListener {
            selectedOption = question.option4
        }
        next.setOnClickListener {
            Quiz.checkOption(selectedOption.toString(), question, this@Question3 )
            Thread.sleep(1200)
            startActivity(Intent(this@Question3, Question4::class.java))
        }
    }
}