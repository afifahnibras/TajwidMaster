package com.example.tajwidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Soal_1SalahTengahActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.soal_1_salahtengah)

        val nextButton: Button = findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            val intent = Intent(this, KeliruActivity::class.java)
            startActivity(intent)
        }
    }
}
