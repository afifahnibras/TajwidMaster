package com.example.tajwidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class AdminLoginActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_admin)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            // Add your login logic here
            if (isValidLogin(username, password)) {
                // If login is successful, navigate to WelcomeAdminActivity
                val intent = Intent(this, WelcomeAdminActivity::class.java)
                startActivity(intent)
                finish() // Optional: close the login activity so the user can't go back to it
            } else {
                // Handle login failure (e.g., show a toast message)
                Toast.makeText(this, "Username atau Password Salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidLogin(username: String, password: String): Boolean {
        // Replace with your actual login validation logic
        return username == "admin" && password == "12345"
    }
}
