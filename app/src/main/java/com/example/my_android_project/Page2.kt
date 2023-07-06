package com.example.my_android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2 : AppCompatActivity() {
    lateinit var bnsign:Button
    lateinit var bnlog:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        bnsign=findViewById(R.id.p2signin)
        bnlog=findViewById(R.id.p2login)

        bnsign.setOnClickListener {
            val sign = Intent(this,Signup::class.java)
            startActivity(sign)
        }


        bnlog.setOnClickListener {
            val log = Intent(this,LogIn::class.java)
            startActivity(log)
        }


    }
}