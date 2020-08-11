package com.camila.lazaro.avaliation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

public class RandomScreen: AppCompatActivity() {
    private lateinit var buttonRandom: Button
    private lateinit var number: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.random_screen)

        initializer()
        buttonRandom.setOnClickListener {
            val random = (0..100).random()
             number.text = random.toString()
        }
    }
    private fun initializer() {
        buttonRandom = findViewById(R.id.button2)
        number = findViewById(R.id.textView)
    }
}