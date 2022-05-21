package com.ufp.bodyhealth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val forgottenPass = findViewById<Button>(R.id.forgotPasswordLogin)

        forgottenPass.setOnClickListener {
            val intent = Intent(this, ForgottenPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}
