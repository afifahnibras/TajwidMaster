package com.example.tajwidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Soal_2SalahPinggirActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.soal_2_salahpinggir)

        val nextButton: Button = findViewById(R.id.next_button)
        nextButton.setOnClickListener {
            val intent = Intent(this, Nilai0Activity::class.java)
            startActivity(intent)
        }
    }
}
