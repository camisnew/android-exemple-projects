package com.camisnew.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class SplashScreen : AppCompatActivity() {

    var delayHandler: Handler? = null
    val delay: Long = 2800

    private val runnable  = Runnable {
        if (!this.isFinishing) {
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        delayHandler = Handler()
        delayHandler!!.postDelayed(runnable, delay)
    }

    override fun onDestroy() {
        super.onDestroy()

        delayHandler?.removeCallbacks(runnable)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemUI()
        }
    }

    private fun hideSystemUI() {
        this.window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE)
    }
}