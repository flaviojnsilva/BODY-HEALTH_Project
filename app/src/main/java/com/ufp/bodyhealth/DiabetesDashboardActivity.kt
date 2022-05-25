package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DiabetesDashboardActivity : AppCompatActivity() {
    lateinit var dbRegisters: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diabetes_dashboard)
        dbRegisters = findViewById(R.id.checkRegistersDiabetes)

        val newRegister = findViewById<Button>(R.id.newRegisterDiabetes)

        newRegister.setOnClickListener {
            val intent = Intent(this, DiabetesRegisterActivity::class.java)
            startActivity(intent)
        }
        dbRegisters.setOnClickListener {
            val intent = Intent(this, DiabetesCheckupActivity::class.java)
            startActivity(intent)
        }
    }
}