package com.camisnew.quiz

import com.camisnew.quiz.questions.Question1

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camisnew.quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuSound = MediaPlayer.create(this@MainActivity, R.raw.menu)
        menuSound.start()

        quizStartButton.setOnClickListener {
            menuSound.stop()
            Quiz.start()
            startActivity(Intent(this@MainActivity, Question1::class.java))
        }
    }
}