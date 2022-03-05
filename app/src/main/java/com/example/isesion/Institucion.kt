package com.example.isesion

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import com.example.isesion.databinding.ActivityInstitucionBinding

class Institucion : AppCompatActivity() {

    private lateinit var binding: ActivityInstitucionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInstitucionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPhone.setOnClickListener{ requestPermissions() }
    }

    private fun requestPermissions() {
        val nTec = 2311336169
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            when{
                ContextCompat.checkSelfPermission(
                    this,
                Manifest.permission.CALL_PHONE
                ) == PackageManager.PERMISSION_GRANTED -> {
                    call(nTec)
                }

                else -> requestPermissionLauncher.launch(Manifest.permission.CALL_PHONE)
            }
        }else{
            call(nTec)
        }
    }

    private fun call(nTec: Long) {
        startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:$nTec")))
    }

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ){isGranted->
        val nTec = 2311336169
        if (isGranted){
            call(nTec)
        }else{
            Toast.makeText(this, "Necesitas conceder los permisos de llamada",Toast.LENGTH_SHORT).show()
        }
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
}