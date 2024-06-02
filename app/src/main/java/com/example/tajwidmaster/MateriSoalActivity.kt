// MateriSoalActivity.kt
package com.example.tajwidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MateriSoalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.materi_soal) // Pastikan file layout ini benar

        // Cari tombol materi_button dalam layout materi_soal.xml
        val materiButton: MaterialButton = findViewById(R.id.materi_button)

        // Set OnClickListener untuk materiButton
        materiButton.setOnClickListener {
            // Buat Intent untuk membuka PilihanMateriActivity
            val intent = Intent(this, PilihanMateriActivity::class.java)
            startActivity(intent)
        }

        val soalButton: MaterialButton = findViewById(R.id.soal_button)
        soalButton.setOnClickListener {
            val intent = Intent(this, JawabSoalActivity::class.java)
            startActivity(intent)
        }

        // Cari tombol kembali (backButton) dalam layout materi_soal.xml
        val backButton: ImageView = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            // Kembali ke MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Opsional: Menutup aktivitas saat kembali ke MainActivity
        }
    }
}
