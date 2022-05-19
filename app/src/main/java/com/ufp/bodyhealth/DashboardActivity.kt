package com.ufp.bodyhealth

import User
import android.app.Activity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import java.util.*

class DashboardActivity : AppCompatActivity() {

    private val userDatabase by lazy { UserDatabase.getDatabase(this).userDao() }
    private val newUserResultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val userText = result.data?.getStringExtra("user_text")
                val userDateAdded = Date()
                val newUser = User(0, "andre", userDateAdded as java.sql.Date)
                lifecycleScope.launch {
                    userDatabase.addUser(newUser)
                }
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

