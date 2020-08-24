package com.camisnew.quiz.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camisnew.quiz.R
import com.camisnew.quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_question2.*
import kotlinx.android.synthetic.main.activity_question2.next

class Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        val question = Quiz.questions[1]
        var selectedOption : String ? = null

        question2Description.text = question.questionDescription
        question2Option1.text = question.option1
        question2Option2.text = question.option2
        question2Option3.text = question.option3
        question2Option4.text = question.option4

        question2Option1.setOnClickListener {
            selectedOption = question.option1
        }
        question2Option2.setOnClickListener {
            selectedOption = question.option2
        }
        question2Option3.setOnClickListener {
            selectedOption = question.option3
        }
        question2Option4.setOnClickListener {
            selectedOption = question.option4
        }

        next.setOnClickListener {
            Quiz.checkOption(selectedOption.toString(), question, this@Question2)
            Thread.sleep(1200)
            startActivity(Intent(this@Question2, Question3::class.java))
        }
    }
}