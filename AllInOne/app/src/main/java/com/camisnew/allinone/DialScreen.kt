package com.camisnew.allinone

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.dial_screen.*

class DialScreen : AppCompatActivity () {

    private lateinit var dialButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dial_screen)
        initializer()

        dialButton.setOnClickListener {
            val phone = editTextPhone.text.toString()

            val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${phone}"))
            startActivity(dialIntent)
        }
    }

    private fun initializer() {
        dialButton = findViewById(R.id.dialButton)
    }
}