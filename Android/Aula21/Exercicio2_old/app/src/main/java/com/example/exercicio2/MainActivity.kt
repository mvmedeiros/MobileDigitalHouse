package com.example.exercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        val InfoFragment = InfoFragment()
        val ResultFragment = ResultFragment()

        transaction.add(R.id.fragmentView1, InfoFragment)
        transaction.commit()


    }
}