package com.laboratorios.API

import retrofit2.Response
import retrofit2.http.POST

interface iExamenes {

   @POST("/ObtenerListadoExamenes")
   suspend fun getListaExamenes():Response<ModelExamenes>

}