package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MeasuresDashboardActivity : AppCompatActivity() {
    lateinit var mRegisters: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_measures_dashboard)
        mRegisters = findViewById(R.id.checkRegistersMeasures)

        val newRegister = findViewById<Button>(R.id.newRegisterMeasures)

        newRegister.setOnClickListener {
            val intent = Intent(this, MeasuresRegisterActivity::class.java)
            startActivity(intent)
        }
        mRegisters.setOnClickListener {
            val intent = Intent(this, MeasuresCheckupActivity::class.java)
            startActivity(intent)
        }
    }
}