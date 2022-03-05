package com.example.isesion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class sesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sesion)
        Toast.makeText(this, "Usted no esta disponible", Toast.LENGTH_SHORT).show()
    }

    fun irHome(view: View){
        val irhome = Intent(this@sesion, Home::class.java)
        startActivity(irhome)
    }
}