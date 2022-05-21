package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val diabetes = findViewById<Button>(R.id.newRegisterDiabetes)
        val measures = findViewById<Button>(R.id.newRegisterDiabetes)
        val blood = findViewById<Button>(R.id.newRegisterDiabetes)

        diabetes.setOnClickListener {
            val intent = Intent(this, DiabetesDashboardActivity::class.java)
            startActivity(intent)
        }
        measures.setOnClickListener {
            val intent = Intent(this, MeasuresDashboardActivity::class.java)
            startActivity(intent)
        }
        blood.setOnClickListener {
            val intent = Intent(this, BloodPressureDashboardActivity::class.java)
            startActivity(intent)
        }

    }
}