package com.laboratorios.API

import com.google.gson.annotations.SerializedName
data class Examen (@SerializedName("IdExamen") val idExamen:Int,
                   @SerializedName("NombreExamen") val nombreExamen:String) {

    override fun toString(): String {
        return "Examen: $idExamen NombreExamen: $nombreExamen"
    }
}