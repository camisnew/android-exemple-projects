package com.camisnew.allinone

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.camisnew.allinone.model.Student
import kotlinx.android.synthetic.main.student_screen.*

class StudentScreen : AppCompatActivity () {

    lateinit var calculateStudentAverage: Button;
    lateinit var student: Student;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.student_screen)

        initializer()

        calculateStudentAverage.setOnClickListener {
            setStudent()
            val average = student.calculateAverage()
            val situation = if(average>6) "Aprovado" else "Reprovado"
            AlertDialog.Builder(this)
                .setTitle("Foi $situation")
                .setMessage("A média de ${student.name} é  $average")
                .setNeutralButton("", null)
                .show()
        }
    }

    private fun initializer() {
        calculateStudentAverage = findViewById(R.id.calculateAverageButton)
    }

    private fun setStudent() {
        student = Student(
            editTextName.text.toString(),
            editTextFirstGrade.text.toString().toDouble(),
            editTextSecondGrade.text.toString().toDouble()
        )
    }


}