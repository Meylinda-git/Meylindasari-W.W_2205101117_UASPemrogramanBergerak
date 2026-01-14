package com.example.generasikomputer

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list_generasi)
        val btnLogout = findViewById<Button>(R.id.btn_logout)

        val generasiList = arrayOf(
            "Generasi 1 (1951-1958) - Vacuum Tubes",
            "Generasi 2 (1959-1964) - Transistor",
            "Generasi 3 (1965-1970) - IC",
            "Generasi 4 (1971-2010) - Microprocessor",
            "Generasi 5 (2011+) - AI & Quantum"
        )

        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, generasiList)

        btnLogout.setOnClickListener {
            getSharedPreferences("login_prefs", MODE_PRIVATE)
                .edit()
                .putBoolean("is_logged_in", false)
                .apply()
            startActivity(Intent(this, SplashActivity::class.java))
            finishAffinity()
        }
    }
}
