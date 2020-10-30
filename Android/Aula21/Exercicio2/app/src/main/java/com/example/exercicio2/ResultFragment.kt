package com.example.exercicio2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_result.*
import kotlinx.android.synthetic.main.fragment_result.view.*

class ResultFragment : Fragment() {
    lateinit var resultView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        resultView = inflater.inflate(R.layout.fragment_result, container, false)

        return resultView
    }

    fun updateText(resultText:String){
        resultView.outputResult.text = resultText
    }
}