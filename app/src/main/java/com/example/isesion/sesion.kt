package com.example.isesion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class sesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sesion)
        Toast.makeText(this, "Usted no esta disponible", Toast.LENGTH_SHORT).show()
    }

    fun entrar(view: View){
        val nUsusario = findViewById<EditText>(R.id.etCorreo).text.toString().trim()
        val ncontraseña = findViewById<EditText>(R.id.etContra).text.toString()

        if (nUsusario == "oscrsnts29@gmail.com" && ncontraseña == "05C4R0809o"){
            val irhome = Intent(this@sesion, Home::class.java)
            startActivity(irhome)

            val toast = Toast.makeText(applicationContext, "Ingreso correcto", Toast.LENGTH_SHORT)
            toast.show()
        }else{
            val toast = Toast.makeText(applicationContext, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT)
            toast.show()
            findViewById<EditText>(R.id.etCorreo).setText("")
            findViewById<EditText>(R.id.etContra).setText("")
        }

    }
}