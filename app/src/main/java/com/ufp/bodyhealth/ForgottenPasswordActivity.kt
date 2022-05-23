package com.ufp.bodyhealth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ForgottenPasswordActivity : AppCompatActivity() {
    private var mAuth: FirebaseAuth? = null
    lateinit var btnRecovery: Button
    lateinit var etEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotten_password)

        btnRecovery = findViewById(R.id.recoveryPasswordButton)
        etEmail = findViewById(R.id.emailLogin)
        mAuth = FirebaseAuth.getInstance()

        btnRecovery.setOnClickListener {
            val email = etEmail.text.toString().trim()

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(applicationContext, "Enter your email!", Toast.LENGTH_SHORT).show()
            } else {
                mAuth!!.sendPasswordResetEmail(email)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(
                                this@ForgottenPasswordActivity,
                                "Check email to reset your password!",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            Toast.makeText(
                                this@ForgottenPasswordActivity,
                                "Fail to send reset password email!",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            }
        }
    }

}
