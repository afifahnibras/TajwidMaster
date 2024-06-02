package com.example.tajwidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class JawabSoal_2Activity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.soal_2)

        val jawabButton: Button = findViewById(R.id.pilihan1_button)
        jawabButton.setOnClickListener {
            val intent = Intent(this, Soal_2SalahPinggirActivity::class.java)
            startActivity(intent)
        }

        val jawab2Button: Button = findViewById(R.id.pilihan2_button)
        jawab2Button.setOnClickListener {
            val intent = Intent(this, Soal_2SalahTengahActivity::class.java)
            startActivity(intent)
        }

        val jawab3Button: Button = findViewById(R.id.pilihan3_button)
        jawab3Button.setOnClickListener {
            val intent = Intent(this, Soal_2BenarActivity::class.java)
            startActivity(intent)
        }

    }
}

