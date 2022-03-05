package com.example.isesion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import java.net.URI
import java.net.URL

class Institucion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_institucion)
    }

    fun ircompartir(view: View){
        val enviar = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,"Pagina Oficial: https://teziutlan.tecnm.mx/")
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(enviar, null)
        startActivity(shareIntent)
    }

    fun enviarWhats(view: View){
        val whats = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,"Pagina Oficial: https://teziutlan.tecnm.mx/")
            setPackage("com.whatsapp")
            type = "text/plain"
        }
        val shareWhats = Intent.createChooser(whats, null)
        startActivity(shareWhats)
    }

    fun correo(view: View){
        val mail = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,"Pagina Oficial: https://teziutlan.tecnm.mx/")
            setPackage("com.google.android.gm")
            type = "text/plain"
        }
        val sendMail = Intent.createChooser(mail, null)
        startActivity(sendMail)
    }

    fun telefono(view: View){
        val fon = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_PHONE_NUMBER, 2311336169)
            setPackage("com.android.server.telecom")
        }
        val shareFon = Intent.createChooser(fon, null)
        startActivity(shareFon)
    }
}