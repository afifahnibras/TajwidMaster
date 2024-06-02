package com.example.tajwidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MateriActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.materi)

        val tambahMateri: Button = findViewById(R.id.btnTambahMateri)
        tambahMateri.setOnClickListener {
            val intent = Intent(this, TambahMateriActivity::class.java)
            startActivity(intent)
        }

        val editMateri: ImageButton = findViewById(R.id.editMateri)
        editMateri.setOnClickListener {
            val intent = Intent(this, EditMateriActivity::class.java)
            startActivity(intent)
        }
    }
}
