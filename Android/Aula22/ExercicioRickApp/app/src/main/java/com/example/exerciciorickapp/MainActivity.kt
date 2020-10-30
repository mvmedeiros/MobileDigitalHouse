package com.example.exerciciorickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exerciciorickapp.api.IRespostaDaApi
import com.example.exerciciorickapp.api.Personagem
import com.example.exerciciorickapp.api.RickApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewManager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.listMain)

        RickApi.getData(this, object : IRespostaDaApi {
            override fun obtevePersonagens(personagens: List<Personagem>) {
                val viewAdapter = MainAdapter(personagens)
                with(recyclerView) {
                    setHasFixedSize(true)
                    layoutManager = viewManager
                    adapter = viewAdapter
                    addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
                }
            }
        })
    }
}