package com.example.my_android_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Btnbooknow:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btnbooknow=findViewById(R.id.btnBook)

        Btnbooknow.setOnClickListener {
            val intent= Intent(this, Page2::class.java)
            startActivity(intent)
        }
    }
}