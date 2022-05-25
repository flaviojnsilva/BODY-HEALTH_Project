package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DiabetesRegisterActivity : AppCompatActivity() {
    lateinit var dbRegisters: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diabetes_register)
        dbRegisters = findViewById(R.id.checkRegistersDiabetes)
        dbRegisters.setOnClickListener {
            val intent = Intent(this, DiabetesCheckupActivity::class.java)
            startActivity(intent)
        }
    }
}