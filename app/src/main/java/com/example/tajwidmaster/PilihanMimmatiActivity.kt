package com.example.tajwidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class PilihanMimmatiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pilihan_mimmati)

        val ikhfasyafawiButton: MaterialButton = findViewById(R.id.ikhfasyafawi_button)
        ikhfasyafawiButton.setOnClickListener {
            val intent = Intent(this, IkhfaSyafawiActivity::class.java)
            startActivity(intent)
        }

        val idghommimiButton: MaterialButton = findViewById(R.id.idghommimi_button)
        idghommimiButton.setOnClickListener {
            val intent = Intent(this, IdghomMitslainActivity::class.java)
            startActivity(intent)
        }

        val idzharsyafawiButton: MaterialButton = findViewById(R.id.idzharsyafawi_button)
        idzharsyafawiButton.setOnClickListener {
            val intent = Intent(this, IdzharSyafawiActivity::class.java)
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