package com.example.generasikomputer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.generasikomputer.R

class GenerasiAdapter(private val data: ArrayList<Any>) :
    RecyclerView.Adapter<GenerasiAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNama: TextView = itemView.findViewById(R.id.tvNama)
        val tvTahun: TextView = itemView.findViewById(R.id.tvTahun)
        val tvTeknologi: TextView = itemView.findViewById(R.id.tvTeknologi)
        val ivGambar: ImageView = itemView.findViewById(R.id.ivGambar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_generasi, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Ganti dengan data Anda
        holder.tvNama.text = "Nama $position"
        holder.tvTahun.text = "Tahun $position"
        holder.tvTeknologi.text = "Teknologi $position"
        Glide.with(holder.itemView).load("https://via.placeholder.com/150").into(holder.ivGambar)
    }
}
