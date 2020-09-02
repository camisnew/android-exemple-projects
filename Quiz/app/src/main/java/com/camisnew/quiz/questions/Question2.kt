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
import kotlinx.android.synthetic.main.activity_question2.*
import java.lang.Thread.sleep

class Question2 : AppCompatActivity() {

    private lateinit var selectedOption : String
    private lateinit var question : Question;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        initializer()

        question2Option1.setOnClickListener {
            selectOption(question.option1, it)
        }
        question2Option2.setOnClickListener {
            selectOption(question.option2, it)
        }
        question2Option3.setOnClickListener {
            selectOption(question.option3, it)
        }
        question2Option4.setOnClickListener {
            selectOption(question.option4, it)
        }

        next.setOnClickListener {
            Quiz.checkOption(selectedOption.toString(), question, this@Question2)
            sleep(1200)
            startActivity(Intent(this@Question2, Question3::class.java))
        }
    }

    private fun initializer() {
        MediaPlayer.create(this@Question2, R.raw.question_sound).start()

        question = Quiz.questions[1]

        question2Description.text = question.questionDescription
        question2Option1.text = question.option1
        question2Option2.text = question.option2
        question2Option3.text = question.option3
        question2Option4.text = question.option4
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun selectOption(option: String, view : View) {
        selectedOption = option
        view.background = getDrawable(R.drawable.selected_background)
    }
}