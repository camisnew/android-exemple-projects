package com.camila.lazaro.avaliation

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.camila.lazaro.avaliation.model.Calculator

public class CalculatorScreen : AppCompatActivity() {
    private lateinit var number1: EditText
    private lateinit var number2: EditText
    private lateinit var operators: Spinner
    private lateinit var calculateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_screen)

        initializer()

        calculateButton.setOnClickListener {
            var calculator = Calculator(number1.text.toString().toDouble(), number2.text.toString().toDouble())

            var alert = AlertDialog.Builder(this)


            if (operators.selectedItemPosition == 0) {
                toast("Select your operator")
            } else if(operators.selectedItemPosition == 1) {
                alert.setTitle("Response Plus")
                alert.setMessage("Result: " + calculator.plus())
                alert.show()
            } else if (operators.selectedItemPosition == 2) {
                alert.setTitle("Response Subtract")
                alert.setMessage("Result: " + calculator.subtract())
                alert.show()
            } else if (operators.selectedItemPosition == 3) {
                alert.setTitle("Response Times")
                alert.setMessage("Result: " + calculator.times())
                alert.show()
            } else {
                alert.setTitle("Response Division")
                alert.setMessage("Result: " + calculator.division())
                alert.show()
            }
        }

    }

    private fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }

    private fun initializer() {
        number1 = findViewById(R.id.editTextNumber)
        number2 = findViewById(R.id.editTextNumber2)
        operators = findViewById(R.id.spinner)
        calculateButton = findViewById(R.id.button)
    }
}