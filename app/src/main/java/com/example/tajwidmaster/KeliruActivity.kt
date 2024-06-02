package com.example.tajwidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class KeliruActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jawaban_keliru)

        val nextButton: Button = findViewById(R.id.continueButton)
        nextButton.setOnClickListener {
            val intent = Intent(this, JawabSoal_2Activity::class.java)
            startActivity(intent)
        }

        val retryButton: Button = findViewById(R.id.retryButton)
        retryButton.setOnClickListener {
            val intent = Intent(this, JawabSoalActivity::class.java)
            startActivity(intent)
        }
    }
}