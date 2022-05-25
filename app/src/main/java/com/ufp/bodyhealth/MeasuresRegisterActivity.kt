package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MeasuresRegisterActivity : AppCompatActivity() {

    lateinit var mRegisters: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_measures_register)
        mRegisters = findViewById(R.id.checkRegistersMeasures)
        mRegisters.setOnClickListener {
            val intent = Intent(this, MeasuresCheckupActivity::class.java)
            startActivity(intent)
        }
    }
}