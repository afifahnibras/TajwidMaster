package com.example.tajwidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class PilihanNunmatiActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.plihan_nunmati)

            val idzharButton: MaterialButton = findViewById(R.id.idzharhalqi_button)
            idzharButton.setOnClickListener {
                val intent = Intent(this, IdzharHalqiActivity::class.java)
                startActivity(intent)
            }

            val iqlabButton: MaterialButton = findViewById(R.id.iqlab_button)
            iqlabButton.setOnClickListener {
                val intent = Intent(this, IqlabActivity::class.java)
                startActivity(intent)
            }

            val ikhfaButton: MaterialButton = findViewById(R.id.ikhfahakiki_button)
            ikhfaButton.setOnClickListener {
                val intent = Intent(this, IkhfaHakikiActivity::class.java)
                startActivity(intent)
            }

            val idghombighunnahButton: MaterialButton = findViewById(R.id.idghombighunnah_button)
            idghombighunnahButton.setOnClickListener {
                val intent = Intent(this, IdghomBighunnahActivity::class.java)
                startActivity(intent)
            }

            val idghombilaghunnahButton: MaterialButton = findViewById(R.id.idghombilaghunnah_button)
            idghombilaghunnahButton.setOnClickListener {
                val intent = Intent(this, IdghomBilaghunnahActivity::class.java)
                startActivity(intent)
            }

            val backButton: ImageView = findViewById(R.id.back_button)
            backButton.setOnClickListener {
                val intent = Intent(this, PilihanMateriActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
