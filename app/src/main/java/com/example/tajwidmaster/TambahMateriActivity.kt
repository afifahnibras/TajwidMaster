package com.example.tajwidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class TambahMateriActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tambah_materi)

        val batalButton: Button = findViewById(R.id.btnBatal)
        batalButton.setOnClickListener {
            val intent = Intent(this, BatalMateriActivity::class.java)
            startActivity(intent)
        }

    }
}
