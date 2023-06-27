package com.example.my_android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogIn : AppCompatActivity() {
    lateinit var buttonlogin:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        buttonlogin=findViewById(R.id.login)

        buttonlogin.setOnClickListener {
            val login = Intent(this,Booking_page::class.java)
            startActivity(login)
        }
    }
}