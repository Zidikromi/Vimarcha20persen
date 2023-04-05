package com.example.vimarcha

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnsignup = findViewById<Button>(R.id.btn_signup)
        btnsignup.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val signinnow = findViewById<Button>(R.id.signinbtn)
        signinnow.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}