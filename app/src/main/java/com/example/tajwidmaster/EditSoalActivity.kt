package com.example.tajwidmaster

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EditSoalActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_soal)

        val batalButton: Button = findViewById(R.id.btnBatal)
        batalButton.setOnClickListener {
            val intent = Intent(this, BatalSoalActivity::class.java)
            startActivity(intent)
        }

    }

}
