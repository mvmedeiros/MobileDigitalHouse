package com.example.rickandmorty2.listagem.view

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty2.R
import com.example.rickandmorty2.listagem.model.ItemModel

class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
    private val image = view.findViewById<ImageView>(R.id.imgIcon)
    private val name = view.findViewById<ImageView>(R.id.name)

    fun bind(itemModel: ItemModel){
        name.text = itemModel.name
        // TODO Usar Picasso
    }
}
