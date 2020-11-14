package com.laboratorios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.view.View
import com.laboratorios.API.ApiAdapter
import com.laboratorios.API.ApiExamenes
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import java.lang.Exception
import kotlin.math.log

class MainActivity : AppCompatActivity() , CoroutineScope by MainScope(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idbtn.setOnClickListener{

            launch(Dispatchers.Main){
                try {
                    val apiExamenRest = ApiAdapter.apiClient.getListaExamenes(2)

                    if(apiExamenRest.isSuccessful && apiExamenRest.body() != null)
                    {
                        val listaExamenes = apiExamenRest.body()?.lista
                        Log.v("Mi Lista",listaExamenes.toString())
                    }

                }
                catch (e: Exception){
                    Log.v("Erros en el btn", e.localizedMessage)
                }
            }

        }

    }


    fun OpenPruebas(view: View) {
       val intent = Intent(this, Pruebas::class.java).apply {
           //
        }
        startActivity(intent)
    }
}