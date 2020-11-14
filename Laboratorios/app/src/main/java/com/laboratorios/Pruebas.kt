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
/*
        val items =  getLists()

        cv_Examenes.layoutManager = LinearLayoutManager(this)
        cv_Examenes.hasFixedSize()
        cv_Examenes.adapter = ExamenAdapter(items)

        cv_Examenes.layoutManager = LinearLayoutManager(this)
        cv_Examenes.adapter = ExamenAdapter(items) */

    }

    fun getLists(): ArrayList<Examene> {
        var lists = ArrayList<Examene>()
        lists.add(Examene(1, "Item 1", "A100BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(2, "Item 2", "A200BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(3, "Item 3", "A400BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(4, "Item 4", "A500BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(1, "Item 1", "A100BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(2, "Item 2", "A200BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(3, "Item 3", "A400BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(4, "Item 4", "A500BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))

        lists.add(Examene(1, "Item 1", "A100BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(2, "Item 2", "A200BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(3, "Item 3", "A400BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(4, "Item 4", "A500BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))

        lists.add(Examene(1, "Item 1", "A100BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(2, "Item 2", "A200BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(3, "Item 3", "A400BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))
        lists.add(Examene(4, "Item 4", "A500BC","NOMBRE DE PRUEBA","A","REQUISITOA","EL MISMO DIA", 200.00,"DESCRIPTION FINAL"))

        return lists;
    }

    fun OpenPruebasDetalle(view: View) {
        val intent = Intent(this, DetallePruebas::class.java).apply {
            //
        }
        startActivity(intent)
    }
}