package com.example.my_android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    lateinit var buttonsignup:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        buttonsignup=findViewById(R.id.btnsignup)

        buttonsignup.setOnClickListener {
            val signup = Intent(this,Booking_page::class.java)
            startActivity(signup)
        }
    }
}