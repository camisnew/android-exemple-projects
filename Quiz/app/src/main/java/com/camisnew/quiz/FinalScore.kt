package com.camisnew.quiz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camisnew.quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_score.*
class FinalScore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val result = "${getText(R.string.result_begin)} ${Quiz.score} ${getText(R.string.result_final)}"
        finalScore.text = result

        val themeSong = MediaPlayer.create(this, R.raw.menu)

        themeSong.start()

        beginButton.setOnClickListener {
            themeSong.stop()
            startActivity(Intent(this@FinalScore, MainActivity::class.java))
        }
    }
}

