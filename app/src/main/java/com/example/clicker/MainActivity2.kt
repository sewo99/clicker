package com.example.clicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val  correctMail = "bozio@bozio.pl"
        val correctPassword = "qwe123"

        val mailInput = findViewById<EditText>(R.id.mailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val loginBtn = findViewById<Button>(R.id.loginBtn)

        loginBtn.setOnClickListener {
            var mail = mailInput.text.toString()
            var password = passwordInput.text.toString()

            if(mail == correctMail &&
                password == correctPassword) {
                Toast.makeText(applicationContext,
                 "Poprawne logowanie", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext,
                    "Nieprawidłowe logowanie", Toast.LENGTH_LONG).show()
            }

        }

    }
}



