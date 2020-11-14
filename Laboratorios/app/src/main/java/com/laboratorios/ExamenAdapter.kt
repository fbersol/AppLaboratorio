package com.laboratorios

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.laboratorios.API.Examen
import com.laboratorios.API.ModelExamenes
import kotlinx.android.synthetic.main.examenitem.view.*

class ExamenAdapter (private val listaModelExamenes: ModelExamenes): RecyclerView.Adapter<ExamenAdapter.ExamenViewHolder>() {

    class ExamenViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(item: Examen) {
            itemView.tv_Codigo.text =item.idExamen.toString()
            itemView.tv_Nombre.text =item.nombreExamen
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExamenViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.examenitem, parent, false)

        return ExamenViewHolder(v)

    }
    override fun onBindViewHolder(holder: ExamenViewHolder, position: Int) {
        holder.bindItems(listaModelExamenes.lista[position])
    }
   override fun getItemCount() = listaModelExamenes.lista.size
}