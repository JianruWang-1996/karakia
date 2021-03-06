package com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.karakiaapp.MainActivity
import com.example.karakiaapp.R

class Splash_Screen : AppCompatActivity() {

    private val SPLASH_TIME: Long = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Handler().postDelayed({
            startActivity(Intent (this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME)

    }
}

