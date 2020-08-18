package com.camisnew.aftertest

import android.os.Bundle
import android.util.Log
import android.util.Log.INFO
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.camisnew.aftertest.model.Month

class MainActivity : AppCompatActivity() {

    lateinit var selected : Spinner
    lateinit var resultButton: Button
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()
        resultButton.setOnClickListener {
            Log.i(INFO.toString(), "?!?!SELECIONOU " + selected.selectedItemPosition)
            result.text = getString(Month.identifyMonth(selected.selectedItemPosition))

        }
    }

    fun initializer() {
        selected = findViewById(R.id.monthSelector)
        resultButton = findViewById(R.id.getResultButton)
        result = findViewById(R.id.resultedMonth)
    }

    fun toast(message: Int) {
        Toast.makeText(baseContext, message.toString(), Toast.LENGTH_LONG).show()
    }
}