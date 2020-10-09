package com.example.meunome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            val textResult = "Meu nome é " + textInput1.text + "!"
            textOutput1.text = textResult
        }

        button2.setOnClickListener{
            textOutput1.text = ""
        }
    }
}