package com.example.vimarcha

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnlogin = findViewById<Button>(R.id.btnlogin)
        btnlogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val signupnow = findViewById<Button>(R.id.signupbtn)
        signupnow.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
    }
}