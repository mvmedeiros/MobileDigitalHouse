package com.example.novatela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra("NAME")
        val idade = intent.getIntExtra("IDADE", 0)

        txtName.text = "O nome é $name, de $idade anos."

        Toast.makeText(this, "Entrou na tela nova ein", Toast.LENGTH_LONG).show()
    }
}