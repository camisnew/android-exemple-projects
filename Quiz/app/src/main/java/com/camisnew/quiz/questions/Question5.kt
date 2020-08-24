package com.camisnew.quiz.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camisnew.quiz.FinalScore
import com.camisnew.quiz.R
import com.camisnew.quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_question5.*
import java.lang.Thread.sleep

class Question5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question5)

        val question = Quiz.questions[4]
        var selectedOption : String ? = null

        question5Description.text = question.questionDescription
        question5Option1.text = question.option1
        question5Option2.text = question.option2
        question5Option3.text = question.option3
        question5Option4.text = question.option4

        question5Option1.setOnClickListener {
            selectedOption = question.option1
        }

        question5Option2.setOnClickListener {
            selectedOption = question.option2
        }

        question5Option3.setOnClickListener {
            selectedOption = question.option3
        }

        question5Option4.setOnClickListener {
            selectedOption = question.option4
        }

        end.setOnClickListener {
            Quiz.checkOption(selectedOption.toString(), question, this@Question5 )
            Thread.sleep(1200)
            startActivity(Intent(this@Question5, FinalScore::class.java))
        }

    }
}