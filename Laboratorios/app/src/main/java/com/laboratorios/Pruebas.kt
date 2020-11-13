package com.laboratorios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_pruebas.*
import kotlinx.android.synthetic.main.activity_pruebas.view.*

class Pruebas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pruebas)

        listExamenes.adapter =  ExamenAdapter(Examenelistdel api)
        listExamenes.layoutManager = LinearLayoutManager(this)

    }




    fun OpenPruebasDetalle(view: View) {
        val intent = Intent(this, DetallePruebas::class.java).apply {
            //
        }
        startActivity(intent)
    }
}