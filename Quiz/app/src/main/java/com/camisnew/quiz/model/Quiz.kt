package com.camisnew.quiz.model

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Handler
import com.camisnew.quiz.R

class Quiz {

    companion object {
        val questions = ArrayList<Question>()
        var score : Int;
        val handler : Handler = Handler()

        init {
            addQuestions()
            questions.shuffle()
            score = 0;
        }

        private fun addQuestions() {
            questions.add(Question( "No processo da fotossíntese, a energia contida nos ATP e os hidrogênios dos NADPH2, serão utilizados para a construção de moléculas de glicose, essa etapa e chamada de:", "fase escura", "fase de fotofosforilação acíclica", "fase de fotofosforilação cíclica", "fase clara", "fase escura"))
            questions.add(Question( "Impermetrabilidade é a qualidade da matéria pela qual:", "dois corpos podem ocupar o mesmo espaço ao mesmo tempo.", "dois corpos não podem ocupar o mesmo espaço ao mesmo tempo.", "Toda ação corresponde a uma reação de mesmo módulo mas de sentido contrário..", "Nenhum corpo muda seu estado de movimento sem uma força contrária.", "dois corpos não podem ocupar o mesmo espaço ao mesmo tempo."))
            questions.add(Question( "Que tipo de ondas são usadas para fazer e receber ligações no celular?", "Ondas gravitacionais", "Ondas sonoras ", "Ondas de rádio", "Ondas de luz", "Ondas de rádio"))
            questions.add(Question( "Um ano-luz mede o quê?", "Tempo", "Distancia", "Peso", "Circunferência", "Distancia"))
            questions.add(Question( "Qual é a menor unidade viva?", "Célula", "Proteina", "Aminoácidos", "RNA", "Célula"))
            questions.add(Question( "Água e óleo não se misturam pois:", "ambas são apolares", "ambas são polares", "água é polar e óleo é apolar", "essas substâncias se odeiam", "água é polar e óleo é apolar"))
            questions.add(Question( "Qual dessas não é uma linguagem de programação?", "HTML", "PHP", "Javascript", "Java", "HTML"))
        }

        fun checkOption(selectedOption: String, question: Question, context: Context) {
            if (question.isThisCorrect(selectedOption)) {
                score++
                MediaPlayer.create(context, R.raw.certa_resposta).start()
            } else {
                MediaPlayer.create(context, R.raw.voce_errou).start()
            }
        }

//        fun waitToNext(intent : Intent, context: Context) {
//            val runnable = Runnable {
//                if(!context.??.isFinishing) {
//                    context.startActivity(intent)
//                }
//            }
//            handler.postDelayed(runnable, 1200)
//        }
    }
}