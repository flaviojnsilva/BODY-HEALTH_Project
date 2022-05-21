package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DiabetesDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diabetes_dashboard)

        val newRegister = findViewById<Button>(R.id.newRegisterDiabetes)

        newRegister.setOnClickListener {
            val intent = Intent(this, DiabetesRegisterActivity::class.java)
            startActivity(intent)
        }

    }
}