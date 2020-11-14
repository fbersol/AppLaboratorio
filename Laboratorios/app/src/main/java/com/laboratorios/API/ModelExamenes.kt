package com.laboratorios.API

import com.google.gson.annotations.SerializedName
data class ModelExamenes (
    @SerializedName("Mensaje") val mensaje:String,
                    @SerializedName("Lista") val lista: List<Examen>)



