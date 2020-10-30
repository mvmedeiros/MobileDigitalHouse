package com.example.exercicio2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_info.*
import kotlinx.android.synthetic.main.fragment_info.view.*
import java.lang.Exception
import java.util.*

class InfoFragment : Fragment() {
    lateinit var iClicou: IClicou

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_info, container, false)

        view.btnCalculate.setOnClickListener {
            try {
                if (inputName?.text.isEmpty()) {
                    inputName.error = "Campo vazio!"
                } else if (inputYear?.text.isEmpty()) {
                    inputYear.error = "Campo vazio!"
                } else {
                    var actualYear = Calendar.getInstance().get(Calendar.YEAR)
                    var age = actualYear - inputYear.text.toString().toInt()
                    iClicou.clicou("${inputName.text}, você tem $age ano(s).")
                }
            } catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
            return view
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        iClicou = context as IClicou
    }
}