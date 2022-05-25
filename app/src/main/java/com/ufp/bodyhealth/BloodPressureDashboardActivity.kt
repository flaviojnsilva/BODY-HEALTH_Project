package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BloodPressureDashboardActivity : AppCompatActivity() {
    lateinit var bpRegisters: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blood_pressure_dashboard)
        bpRegisters = findViewById(R.id.checkRegistersBloodPressure)

        val newRegister = findViewById<Button>(R.id.newRegisterBloodPressure)

        newRegister.setOnClickListener {
            val intent = Intent(this, BloodPressureRegisterActivity::class.java)
            startActivity(intent)
        }
        bpRegisters.setOnClickListener {
            val intent = Intent(this, BloodPressureCheckupActivity::class.java)
            startActivity(intent)
        }

    }
}