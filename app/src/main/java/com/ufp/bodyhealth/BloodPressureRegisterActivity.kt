package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BloodPressureRegisterActivity : AppCompatActivity() {

    lateinit var bpRegisters: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blood_pressure_register)

        bpRegisters = findViewById(R.id.checkRegistersBloodPressure)
        bpRegisters.setOnClickListener {
            val intent = Intent(this, BloodPressureCheckupActivity::class.java)
            startActivity(intent)
        }
    }
}