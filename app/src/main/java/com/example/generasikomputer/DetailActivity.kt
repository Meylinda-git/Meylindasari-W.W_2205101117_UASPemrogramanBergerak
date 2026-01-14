package com.example.generasikomputer

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNama = findViewById<TextView>(R.id.tv_nama)
        val tvTahun = findViewById<TextView>(R.id.tv_tahun)
        val tvTeknologi = findViewById<TextView>(R.id.tv_teknologi)
        val tvContoh = findViewById<TextView>(R.id.tv_contoh)
        val ivGambar = findViewById<ImageView>(R.id.iv_gambar)
        val btnBack = findViewById<ImageButton>(R.id.btn_back)

        // Get data from intent
        val nama = intent.getStringExtra("nama") ?: ""
        val tahun = intent.getStringExtra("tahun") ?: ""
        val teknologi = intent.getStringExtra("teknologi") ?: ""
        val contoh = intent.getStringExtra("contoh") ?: ""
        val gambar = intent.getIntExtra("gambar", 0)

        tvNama.text = nama
        tvTahun.text = tahun
        tvTeknologi.text = teknologi
        tvContoh.text = contoh

        Glide.with(this).load(gambar).into(ivGambar)

        btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}
