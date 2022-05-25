package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {

    lateinit var diabetes: Button
    lateinit var measures: Button
    lateinit var blood: Button
    lateinit var profile: ImageView
    lateinit var steps: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        diabetes = findViewById(R.id.diabetesDashboard)
        measures = findViewById(R.id.measuresDashboard)
        blood = findViewById(R.id.bloodPressureDashboard)
        profile = findViewById(R.id.iconProfileDashboard)
        steps = findViewById(R.id.stepsNumberDashboard)

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
        profile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        steps.setOnClickListener {
            val intent = Intent(this, ActivityResumeActivity::class.java)
            startActivity(intent)
        }
    }
}