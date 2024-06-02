package com.example.tajwidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class SoalActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.soal)

        val tambahSoal: Button = findViewById(R.id.btnTambahSoal)
        tambahSoal.setOnClickListener {
            val intent = Intent(this, TambahSoalActivity::class.java)
            startActivity(intent)
        }

        val editSoal: ImageButton = findViewById(R.id.editSoal)
        editSoal.setOnClickListener {
            val intent = Intent(this, EditSoalActivity::class.java)
            startActivity(intent)
        }
    }
}
