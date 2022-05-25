package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DiabetesCheckupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diabetes_checkup)

        val newRegister = findViewById<Button>(R.id.newRegisterDiabetes)
        newRegister.setOnClickListener {
            val intent = Intent(this, DiabetesRegisterActivity::class.java)
            startActivity(intent)
        }
    }
}