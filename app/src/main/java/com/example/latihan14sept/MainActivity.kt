package com.example.latihan14sept

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnMi : Button
    private lateinit var btnTk : Button
    private lateinit var btnGaleri : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMi = findViewById(R.id.btnMi)
        btnTk = findViewById(R.id.btnTk)
        btnGaleri = findViewById(R.id.btnGaleri)

        btnMi.setOnClickListener() {
            intent = Intent(this@MainActivity, ManajementInformatikaActivity::class.java)
            startActivity(intent)
        }

        btnTk.setOnClickListener() {
            intent = Intent(this@MainActivity, TeknikKomputerActivity::class.java)
            startActivity(intent)
        }

        btnGaleri.setOnClickListener() {
            intent = Intent(this@MainActivity, RecyclePnpActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_wisata)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}