package com.example.tajwidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Nilai0Activity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nilai0)

        val berandaButton: Button = findViewById(R.id.beranda_button)
        berandaButton.setOnClickListener {
            val intent = Intent(this, MateriSoalActivity::class.java)
            startActivity(intent)
        }
    }
}
