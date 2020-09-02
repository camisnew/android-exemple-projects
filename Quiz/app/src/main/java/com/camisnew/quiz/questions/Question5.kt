package com.camisnew.quiz.questions

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.camisnew.quiz.FinalScore
import com.camisnew.quiz.R
import com.camisnew.quiz.model.Question
import com.camisnew.quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_question5.*
import java.lang.Thread.sleep

class Question5 : AppCompatActivity() {

    private lateinit var selectedOption : String
    private lateinit var question : Question;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question5)

        initializer()

        question5Option1.setOnClickListener {
            selectOption(question.option1, it)
        }
        question5Option2.setOnClickListener {
            selectOption(question.option2, it)
        }
        question5Option3.setOnClickListener {
            selectOption(question.option3, it)
        }
        question5Option4.setOnClickListener {
            selectOption(question.option4, it)
        }

        end.setOnClickListener {
            Quiz.checkOption(selectedOption.toString(), question, this@Question5 )
            sleep(1200)
            startActivity(Intent(this@Question5, FinalScore::class.java))
        }
    }

    private fun initializer() {
        MediaPlayer.create(this@Question5, R.raw.question_sound).start()

        question = Quiz.questions[4]

        question5Description.text = question.questionDescription
        question5Option1.text = question.option1
        question5Option2.text = question.option2
        question5Option3.text = question.option3
        question5Option4.text = question.option4
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun selectOption(option: String, view : View) {
        selectedOption = option
        view.background = getDrawable(R.drawable.selected_background)
    }
}