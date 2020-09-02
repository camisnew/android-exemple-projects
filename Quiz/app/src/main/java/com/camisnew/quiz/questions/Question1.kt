package com.camisnew.quiz.questions

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.camisnew.quiz.R
import com.camisnew.quiz.model.Question
import com.camisnew.quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_question1.*
import java.lang.Thread.sleep

class Question1 : AppCompatActivity() {

    private lateinit var selectedOption : String
    private lateinit var question : Question;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        initializer()

        question1Option1.setOnClickListener {
            selectOption(question.option1, it)
        }
        question1Option2.setOnClickListener {
            selectOption(question.option2, it)

        }
        question1Option3.setOnClickListener {
            selectOption(question.option3, it)
        }
        question1Option4.setOnClickListener {
            selectOption(question.option4, it)
        }

        next.setOnClickListener {
            Quiz.checkOption(selectedOption.toString(), question, this@Question1 )
            sleep(1200)
            startActivity(Intent(this@Question1, Question2::class.java))
        }
    }

    fun initializer() {
        MediaPlayer.create(this, R.raw.question_sound).start()

        question = Quiz.questions[0]

        question1Description.text = question.questionDescription
        question1Option1.text = question.option1
        question1Option2.text = question.option2
        question1Option3.text = question.option3
        question1Option4.text = question.option4
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun selectOption(option: String, view : View) {
        selectedOption = option
        view.background = getDrawable(R.drawable.selected_background)
    }
}