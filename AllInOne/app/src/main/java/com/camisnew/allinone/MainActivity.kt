package com.camisnew.allinone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonDialScreen : Button
    lateinit var buttonStudentScreen : Button
    lateinit var buttonSquareScreen : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonDialScreen.setOnClickListener {
            val dialScreen = Intent(this@MainActivity, DialScreen::class.java)
            startActivity(dialScreen)
        }
        buttonStudentScreen.setOnClickListener {
            val studentScreen = Intent(this@MainActivity, StudentScreen::class.java)
            startActivity(studentScreen)
        }
        buttonSquareScreen.setOnClickListener {
            val squareScreen = Intent(this@MainActivity, SquareScreen::class.java)
            startActivity(squareScreen)
        }
    }

    private fun initializer() {
        buttonDialScreen = findViewById(R.id.dial_screen_button)
        buttonStudentScreen = findViewById(R.id.student_screen_button)
        buttonSquareScreen = findViewById(R.id.square_screen_button)
    }
}