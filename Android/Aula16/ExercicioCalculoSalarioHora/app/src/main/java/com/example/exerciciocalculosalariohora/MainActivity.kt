package com.example.exerciciocalculosalariohora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener{
            val result = textInput1.text.toString().toDouble()*textInput2.text.toString().toDouble()

            val textResult = "R$ " + result.toString()
            textOutput1.text = textResult
        }

        btn2.setOnClickListener{
            textOutput1.text = ""
        }
    }
}
