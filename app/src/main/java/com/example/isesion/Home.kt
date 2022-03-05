package com.example.isesion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Toast.makeText(this, "Usted esta disponible", Toast.LENGTH_SHORT).show()
        val formato = SimpleDateFormat("d MMM yyyy")
        val d = formato.format(Calendar.getInstance().time)

        val fecha = findViewById<TextView>(R.id.tvDate).apply {
            text = d.toString()
        }
    }

    fun irDe(view: View){
        val irAd = Intent(this@Home, AcercaDe::class.java)
            startActivity(irAd)
    }

    fun irAsig(view: View){
        val irAsg = Intent(this@Home, Asignaturas::class.java)
        startActivity(irAsg)
    }

    fun irAviso(view: View){
        val irAv = Intent(this@Home, Avisos::class.java)
        startActivity(irAv)
    }

    fun irDatos(view: View){
        val irD = Intent(this@Home, Datos::class.java )
        startActivity(irD)
    }

    fun irInstituc(view: View){
        val irInst = Intent(this@Home, Institucion::class.java)
        startActivity(irInst)
    }
}