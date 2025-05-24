package com.example.acamovi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Navegación a Login
        val goToLogin = findViewById<TextView>(R.id.tvGoToLogin)
        goToLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Opcional: cierra la actividad actual
        }

        // Navegación al MainActivity al registrarse
        val btnRegister = findViewById<Button>(R.id.btnRegister)
        btnRegister.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish() // Opcional: cierra la actividad actual
        }
    }
}