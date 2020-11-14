package com.laboratorios.API

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiAdapter
{
       val apiClient: ApiExamenes = Retrofit.Builder()
        .baseUrl("http://www.json-generator.com")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiExamenes::class.java)


}