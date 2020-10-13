package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import java.lang.Exception

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnReturnLogin.setOnClickListener{
            finish()
        }

        checkBoxPrivacyPolicy.setOnCheckedChangeListener { _, isChecked ->
           btnSignUp.isEnabled = isChecked
        }

        btnSignUp.setOnClickListener {
            val name = signName.text.toString().trim()
            val email = signEmail.text.toString().trim()
            val password = signPassword.text.toString()

            try{
                if(name.isEmpty()){
                    signName.error = "Campo vazio!"
                }else if(!email.isEmailValid()){
                    signEmail.error = "Endereço de email não válido!"
                }else if(password.isEmpty()){
                    signPassword.error = "Campo vazio!"
                }else{
                    UserService.register(name, email, password)
                    Toast.makeText(this, "Usuário cadastrado com sucesso!", Toast.LENGTH_LONG).show()
                    finish()
                }
            }catch(e: Exception){
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
        }
    }

    fun String.isEmailValid(): Boolean {
        return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }
}