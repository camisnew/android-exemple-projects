package com.camisnew.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.camisnew.calculadora.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var buttonGetSuccessChance : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        initializer()

        buttonGetSuccessChance.setOnClickListener {
            val resultScreen = Intent(this@MainActivity, ResultScreen::class.java);
//            var person = Person(editTextTextPersonName.text.toString(), editTextTextPersonProfession.text.toString())
            startActivity(resultScreen)
        }
    }

    private fun initializer() {
        buttonGetSuccessChance = findViewById(R.id.calculateSuccess);
    }
}