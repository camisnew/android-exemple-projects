package com.camisnew.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var redButton: Button;
    lateinit var greenButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redButton = findViewById(R.id.red_button)
        greenButton = findViewById(R.id.green_button)

        redButton.setOnClickListener {
            val layout2 = Intent(this@MainActivity, Atividade1::class.java)
            startActivity(layout2)
        }
        greenButton.setOnClickListener {
            val layout3 = Intent(this@MainActivity, Atividade2::class.java)
            startActivity(layout3)
        }

    }
}