package com.example.exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager
        val Fragment1 = Fragment1()
        val Fragment2 = Fragment2()

        button.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentView, Fragment1)
            transaction.commit()
        }

        button2.setOnClickListener {
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentView, Fragment2)
            transaction.commit()
        }
    }
}