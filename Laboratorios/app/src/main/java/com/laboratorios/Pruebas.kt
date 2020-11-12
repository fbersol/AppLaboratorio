package com.laboratorios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Pruebas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pruebas)
    }
    fun OpenPruebasDetalle(view: View) {
        val intent = Intent(this, DetallePruebas::class.java).apply {
            //
        }
        startActivity(intent)
    }
}