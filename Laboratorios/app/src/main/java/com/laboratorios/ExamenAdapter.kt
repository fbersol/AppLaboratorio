package com.laboratorios

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.examenitem.view.*

class ExamenAdapter (private val examen: List<String>): RecyclerView.Adapter<ExamenAdapter.ExamenViewHolder>() {


    class ExamenViewHolder(textView : TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExamenViewHolder {

        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.examenitem, parent, false) as TextView

        return ExamenViewHolder(textView)

    }

    override fun onBindViewHolder(holder: ExamenViewHolder, position: Int) {
        holder.itemView.NombreExamen.text = examen[position]
    }

   override fun getItemCount() = examen.size
}