package com.camila.lazaro.avaliation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var randomScreenButton : Button
    lateinit var calculatorScreenButton : Button
    lateinit var aboutScreenButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializer()

        randomScreenButton.setOnClickListener {
            val randomScreen = Intent(this@MainActivity, RandomScreen::class.java )
            startActivity(randomScreen)
        }
        calculatorScreenButton.setOnClickListener {
            val calculatorScreen = Intent(this@MainActivity, CalculatorScreen::class.java )
            startActivity(calculatorScreen)
        }
        aboutScreenButton.setOnClickListener {
            val aboutScreen = Intent(this@MainActivity, AboutScreen::class.java )
            startActivity(aboutScreen)
        }
    }

    private fun initializer() {
        randomScreenButton = findViewById(R.id.random_screen_button)
        calculatorScreenButton = findViewById(R.id.calculator_screen_button)
        aboutScreenButton = findViewById(R.id.about_screen_button)
    }
}