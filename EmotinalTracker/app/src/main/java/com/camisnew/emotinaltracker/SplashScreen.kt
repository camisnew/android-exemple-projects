package com.camisnew.emotinaltracker

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    private var delayHandler : Handler? = null
    private val delay : Long = 2500

    internal val runnable = Runnable {
        if(!isFinishing) {
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        delayHandler = Handler()
        delayHandler!!.postDelayed(runnable, delay)
    }


}