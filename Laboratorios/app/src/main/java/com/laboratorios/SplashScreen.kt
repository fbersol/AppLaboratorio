package com.laboratorios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        val animationderecha = AnimationUtils.loadAnimation(this,R.anim.right_to_left)
        val animationizquierda = AnimationUtils.loadAnimation(this,R.anim.left_to_right)

        val textview = findViewById<TextView>(R.id.txtTitulo)
        val imageview = findViewById<ImageView>(R.id.imgvLogo)

        textview.animation = animationderecha
        imageview.animation = animationizquierda

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Login::class.java).apply {
                //
            }
            startActivity(intent)
            finish()
        }, 3000)


    }
}