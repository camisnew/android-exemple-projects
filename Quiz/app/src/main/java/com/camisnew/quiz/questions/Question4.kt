package com.camisnew.quiz.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camisnew.quiz.R
import com.camisnew.quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_question1.*
import kotlinx.android.synthetic.main.activity_question4.*
import kotlinx.android.synthetic.main.activity_question4.next

class Question4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question4)

        val question = Quiz.questions[3]
        var selectedOption : String ? = null

        question4Description.text = question.questionDescription
        question4Option1.text = question.option1
        question4Option2.text = question.option2
        question4Option3.text = question.option3
        question4Option4.text = question.option4

        question4Option1.setOnClickListener {
            selectedOption = question.option1
        }
        question4Option2.setOnClickListener {
            selectedOption = question.option2
        }
        question4Option3.setOnClickListener {
            selectedOption = question.option3
        }
        question4Option4.setOnClickListener {
            selectedOption = question.option4
        }

        next.setOnClickListener {
            Quiz.checkOption(selectedOption.toString(), question, this@Question4 )
            Thread.sleep(1200)
            startActivity(Intent(this@Question4, Question5::class.java))
        }
    }
}