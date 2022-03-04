package com.example.isesion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class sesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sesion)
    }

    fun irHome(view: View){
        val irhome = Intent(this@sesion, Home::class.java)
        startActivity(irhome)
    }
}