package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BloodPressureDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blood_pressure_dashboard)

        val newRegister = findViewById<Button>(R.id.newRegisterBloodPressure)

        newRegister.setOnClickListener {
            val intent = Intent(this, MeasuresRegisterActivity::class.java)
            startActivity(intent)
        }

    }
}