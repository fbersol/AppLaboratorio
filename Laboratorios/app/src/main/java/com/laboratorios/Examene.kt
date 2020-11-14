package com.laboratorios

import com.google.gson.annotations.SerializedName

data class Examene (@SerializedName("ID") val ID:Int,
                    @SerializedName("TIPO") val TIPO:String,
                    @SerializedName("CODIGO") val CODIGO:String,
                    @SerializedName("NOMBRE") val NOMBRE:String,
                    @SerializedName("TIPOMUESTRA") val TIPOMUESTRA: String,
                    @SerializedName("REQUISITOSPACIENTE") val REQUISITOSPACIENTE:String,
                    @SerializedName("ENTREGA") val ENTREGA:String,
                    @SerializedName("PRECIO") val PRECIO:Double,
                    @SerializedName("DESCRIPCION") val DESCRIPCION:String)


