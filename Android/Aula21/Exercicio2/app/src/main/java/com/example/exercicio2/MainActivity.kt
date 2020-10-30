package com.example.exercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IClicou {
    val ResultFragment = ResultFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager
        val infoTransaction = manager.beginTransaction()
        val resultTransaction = manager.beginTransaction()

        infoTransaction.add(R.id.fragmInput, InfoFragment())
        infoTransaction.commit()

        resultTransaction.add(R.id.fragmResult, ResultFragment)
        resultTransaction.commit()
    }

    override fun clicou(texto: String){
        ResultFragment.updateText(texto)
    }
}