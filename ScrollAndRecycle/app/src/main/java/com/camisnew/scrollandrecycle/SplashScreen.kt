package com.camisnew.scrollandrecycle

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    private var delayHandler: Handler? = null
    private val DELAY: Long = 2000

    private val runnable = Runnable {
        if(!isFinishing) {
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        delayHandler = Handler()
        delayHandler!!.postDelayed(runnable, DELAY)
    }

    override fun onDestroy() {
        super.onDestroy()

        delayHandler?.removeCallbacks(runnable)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus) hideSystemUI()
    }

    private fun hideSystemUI() {
        this.window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE)
    }


}