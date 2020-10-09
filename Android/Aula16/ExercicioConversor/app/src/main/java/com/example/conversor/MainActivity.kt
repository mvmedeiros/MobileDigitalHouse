package com.example.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener{
            val degreesConvert = 32.0 + (degreesInput1.text.toString().toDouble() * 9.0) / 5.0
            val textResult = degreesInput1.text.toString() + " °C = " + degreesConvert + " °F"
            textOutput1.text = textResult 
        }
    }
}