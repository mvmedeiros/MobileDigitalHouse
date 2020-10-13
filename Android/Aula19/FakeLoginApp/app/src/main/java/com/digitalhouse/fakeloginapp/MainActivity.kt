package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService.Companion.logIn
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateAccount.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }

        btnLogin.setOnClickListener{

            val user = logIn(loginEmail.text.toString(), loginPassword.text.toString())

            if(user != null){
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("NAME",user.name)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Usuário ou senha incorreto(s)!", Toast.LENGTH_LONG).show()
            }
        }
    }
}