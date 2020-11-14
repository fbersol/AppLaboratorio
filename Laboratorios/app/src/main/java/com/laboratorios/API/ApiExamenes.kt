package com.laboratorios.API

import com.laboratorios.Examene
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ApiExamenes {

       // @Headers("Content-Type: application/json")
        @GET("/api/json/get/cfJFPHMWPS")
       // @FormUrlEncoded
        suspend fun getListaExamenes(@Query("indent") indent:Int ): Response<ModelExamenes>

}