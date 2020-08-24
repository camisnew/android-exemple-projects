package com.camisnew.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camisnew.quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_score.*

class FinalScore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val result = "Você acertou um total de ${Quiz.score} perguntas"

        finalScore.text = result

        beginButton.setOnClickListener {
            startActivity(Intent(this@FinalScore, MainActivity::class.java))
        }
    }
}