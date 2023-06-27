package com.example.my_android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2 : AppCompatActivity() {
    lateinit var buttonsign:Button
    lateinit var buttonlog:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        buttonsign=findViewById(R.id.p2signin)
        buttonlog=findViewById(R.id.p2login)

        buttonsign.setOnClickListener {
            val sign = Intent( this,Signup::class.java)
            startActivity(sign)
        }


        buttonlog.setOnClickListener {
            val log = Intent(this,LogIn::class.java)
            startActivity(log)
        }


    }
}