//package com.example.tajwidmaster
//
//import android.content.Intent
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.widget.Button
//import androidx.appcompat.app.AlertDialog
//import androidx.appcompat.app.AppCompatActivity
//
//class KeluarActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.welcome_admin)
//
//        val exitButton = findViewById<Button>(R.id.btnLogout)
//        exitButton.setOnClickListener {
//            showExitDialog()
//        }
//    }
//
//    private fun showExitDialog() {
//        val inflater: LayoutInflater = LayoutInflater.from(this)
//        val dialogView = inflater.inflate(R.layout.dialog_keluar, null)
//
//        val dialogBuilder = AlertDialog.Builder(this)
//        dialogBuilder.setView(dialogView)
//
//        val alertDialog = dialogBuilder.create()
//
//        val btnYes: Button = dialogView.findViewById(R.id.btnYes)
//        val btnNo: Button = dialogView.findViewById(R.id.btnNo)
//
//        btnYes.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//            startActivity(intent)
//        }
//
//        btnNo.setOnClickListener {
//            alertDialog.dismiss()
//        }
//
//        alertDialog.show()
//    }
//}
