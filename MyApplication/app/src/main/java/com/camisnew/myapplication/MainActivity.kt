package com.camisnew.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var redButton: Button;
    private lateinit var greenButton: Button;
    private lateinit var blueButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redButton = findViewById(R.id.red_button)
        greenButton = findViewById(R.id.green_button)
        blueButton = findViewById(R.id.blue_button)

        redButton.setOnClickListener {
            val layout2 = Intent(this@MainActivity, Atividade1::class.java)
            startActivity(layout2)
        }

        greenButton.setOnClickListener {
            val layout3 = Intent(this@MainActivity, Atividade2::class.java)
            startActivity(layout3)
        }

        blueButton.setOnClickListener {
            val layout4 = Intent(this@MainActivity, Atividade3::class.java)
            startActivity(layout4)
        }

    }
}