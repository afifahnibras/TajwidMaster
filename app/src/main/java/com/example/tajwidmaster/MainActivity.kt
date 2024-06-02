// MainActivity.kt
package com.example.tajwidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.masuk)

        val masukButton: MaterialButton = findViewById(R.id.masuk_button)
        masukButton.setOnClickListener {
            val intent = Intent(this, MateriSoalActivity::class.java)
            startActivity(intent)
        }

        val adminButton: ImageView = findViewById(R.id.account_icon)
        adminButton.setOnClickListener {
            val intent = Intent(this, AdminLoginActivity::class.java)
            startActivity(intent)
        }
    }
}
