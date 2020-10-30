package com.example.exerciciorickapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciciorickapp.api.Personagem
import com.squareup.picasso.Picasso

class MainAdapter(private val personagens: List<Personagem>):
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val ivImage: ImageView = view.findViewById(R.id.iv_image)
        private val tvName: TextView = view.findViewById(R.id.tv_name)
        private val tvStatus: TextView = view.findViewById(R.id.tv_status)
        private val tvSpecie : TextView = view.findViewById(R.id.tv_specie)
        private val tvLocation: TextView = view.findViewById(R.id.tv_location)

        fun bind(personagem: Personagem) {

            loadImage(personagem)
        }

        private fun loadImage(personagem: Personagem){
            Picasso.get()
                .load(personagem.imagemUrl)
                .into(ivImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(personagens[position])
    }

    override fun getItemCount() = personagens.size
}