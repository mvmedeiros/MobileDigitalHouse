package com.example.fakeloginapp20

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fakeloginapp20.users.UserService
import com.google.android.material.tabs.TabLayout
import com.google.android.material.textfield.TextInputEditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SignUpFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignUpFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)

        //XML ids connection
        val checkBoxPrivacyPolicy = view.findViewById<CheckBox>(R.id.checkBoxPrivacyPolicy)
        val signUpButton = view.findViewById<Button>(R.id.btnSignUp)
        val signUpUsername  = view.findViewById<TextInputEditText>(R.id.etSignUpUsername)
        val signUpPassword = view.findViewById<TextInputEditText>(R.id.etSignUpPassword)
        val signUpPasswordCheck = view.findViewById<TextInputEditText>(R.id.etSignUpPasswordCheck)

        checkBoxPrivacyPolicy.setOnCheckedChangeListener { _, isChecked ->
            signUpButton.isEnabled = isChecked
        }

        signUpButton.setOnClickListener {
            val name = signUpUsername.text.toString().trim()
            val password = signUpPassword.text.toString()
            val passwordCheck = signUpPasswordCheck.text.toString()

            try {
                if (name.isEmpty()) {
                    signUpUsername.error = "Campo vazio!"
                } else if (password.isEmpty()) {
                    signUpPassword.error = "Campo vazio!"
                } else if (passwordCheck.isEmpty()) {
                    signUpPasswordCheck.error = "Campo vazio!"
                } else if(password != passwordCheck){
                    signUpPasswordCheck.error = "As senhas não são iguais!"
                } else{
                    UserService.register(name, password)
                    Toast.makeText(activity, "Usuário cadastrado com sucesso!", Toast.LENGTH_LONG).show()

                    Handler(Looper.getMainLooper()).postDelayed({

                        view.findViewById<TextInputEditText>(R.id.etSignUpUsername).setText("")
                        view.findViewById<TextInputEditText>(R.id.etSignUpPassword).setText("")
                        view.findViewById<TextInputEditText>(R.id.etSignUpPasswordCheck).setText("")
                        view.findViewById<CheckBox>(R.id.checkBoxPrivacyPolicy).isChecked = false

                        val tab = activity!!.findViewById(R.id.tabLayout) as TabLayout
                        tab.getTabAt(0)?.select()

                    }, 1000)
                }
            }catch (e: Exception){
                Toast.makeText(activity, e.message, Toast.LENGTH_LONG).show()
            }
        }

        return view
    }
}
