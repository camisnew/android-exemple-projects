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
import kotlinx.android.synthetic.main.activity_question4.*
import java.lang.Thread.sleep

class Question4 : AppCompatActivity() {

    private lateinit var selectedOption : String
    private lateinit var question : Question;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question4)

        initializer()

        question4Option1.setOnClickListener {
            selectOption(question.option1, it)
        }
        question4Option2.setOnClickListener {
            selectOption(question.option2, it)
        }
        question4Option3.setOnClickListener {
            selectOption(question.option3, it)
        }
        question4Option4.setOnClickListener {
            selectOption(question.option4, it)
        }

        next.setOnClickListener {
            Quiz.checkOption(selectedOption.toString(), question, this@Question4 )
            sleep(1200)
            startActivity(Intent(this@Question4, Question5::class.java))
        }
    }

    fun initializer() {
        MediaPlayer.create(this@Question4, R.raw.question_sound).start()

        question = Quiz.questions[3]

        question4Description.text = question.questionDescription
        question4Option1.text = question.option1
        question4Option2.text = question.option2
        question4Option3.text = question.option3
        question4Option4.text = question.option4
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun selectOption(option: String, view : View) {
        selectedOption = option
        view.background = getDrawable(R.drawable.selected_background)
    }
}