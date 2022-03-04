package com.example.isesion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    fun irsesion(view: View){
        val sesi = Intent(this@MainActivity, sesion::class.java)
        startActivity(sesi)
    }
}