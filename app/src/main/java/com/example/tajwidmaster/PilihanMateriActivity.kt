package com.example.tajwidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class PilihanMateriActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pilihan_materi)

        val nunmatiButton: MaterialButton = findViewById(R.id.nunmati_button)
        nunmatiButton.setOnClickListener {
            val intent = Intent(this, PilihanNunmatiActivity::class.java)
            startActivity(intent)
        }

        val mimmatiButton: MaterialButton = findViewById(R.id.mimmati_button)
        mimmatiButton.setOnClickListener {
            val intent = Intent(this, PilihanMimmatiActivity::class.java)
            startActivity(intent)
        }

        val backButton: ImageView = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            val intent = Intent(this, MateriSoalActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

