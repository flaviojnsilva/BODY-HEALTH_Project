package com.ufp.bodyhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {

    private lateinit var etFirstName: EditText
    lateinit var etLastName: EditText
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    lateinit var etConfPass: EditText
    private lateinit var btnSignUp: Button
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etFirstName = findViewById(R.id.firstNameRegister)
        etLastName = findViewById(R.id.lastNameRegister)
        etEmail = findViewById(R.id.emailRegister)
        etPassword = findViewById(R.id.passwordRegister)
        etConfPass = findViewById(R.id.passwordConfirmationRegister)
        btnSignUp = findViewById(R.id.registerButton)
        mAuth = Firebase.auth
        btnSignUp.setOnClickListener {
            signUpUser()
        }
    }

    private fun signUpUser() {

        val firstName = etFirstName.text.toString()
        val lastName = etLastName.text.toString()
        val email = etEmail.text.toString()
        val pass = etPassword.text.toString()
        val confirmPassword = etConfPass.text.toString()

        // check pass
        if (email.isBlank() || pass.isBlank() || confirmPassword.isBlank()) {
            Toast.makeText(this, "Por favor preencha os dados!", Toast.LENGTH_SHORT).show()
            return
        }
        if (pass != confirmPassword) {
            Toast.makeText(this, "Confirmação password errada!", Toast.LENGTH_SHORT)
                .show()
            return
        }
        mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Registo com sucesso!", Toast.LENGTH_SHORT).show()
                btnSignUp.setOnClickListener {
                    val intent = Intent(this, DashboardActivity::class.java)
                    startActivity(intent)
                }
            } else {
                Toast.makeText(this, "Registo Falhado!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}