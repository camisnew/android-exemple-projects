package com.camisnew.calculadora

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.camisnew.calculadora.model.Person

class ResultScreen : AppCompatActivity() {

    lateinit var vaiDarMerda: MediaPlayer
    lateinit var tavaRuimTavaBom: MediaPlayer
    lateinit var hojeSim: MediaPlayer
    lateinit var acertouMizeravi: MediaPlayer
    lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_screen)

        initializer()

        val butau : Button = findViewById(R.id.imReady)
        butau.setOnClickListener {
            person = Person("ana", "dev")
            val selecionado = person.calculateSuccessChance()

            if(selecionado in 0..25) vaiDarMerda.start()
            if(selecionado in 26..50) tavaRuimTavaBom.start()
            if(selecionado in 51..75) hojeSim.start()
            if(selecionado in 0..25) acertouMizeravi.start()
            }
        }

    private fun initializer() {
        vaiDarMerda = MediaPlayer.create(this@ResultScreen, R.raw.vai_dar_merda)
        tavaRuimTavaBom = MediaPlayer.create(this@ResultScreen,R.raw.tava_ruim_tava_bom)
        hojeSim = MediaPlayer.create(this@ResultScreen,R.raw.hoje_sim)
        acertouMizeravi = MediaPlayer.create(this@ResultScreen,R.raw.acertou_mizeravi)
    }

}
