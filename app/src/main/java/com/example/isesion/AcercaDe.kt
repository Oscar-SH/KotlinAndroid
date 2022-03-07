package com.example.isesion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AcercaDe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)
    }
    fun irGit(view: View){
        val irG = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/"))
        startActivity(irG)
    }

}