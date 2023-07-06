package com.example.my_android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Booking_page : AppCompatActivity() {
    lateinit var book: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_page)
        book = findViewById(R.id.button)

        book.setOnClickListener {
            val intent = Intent(this, lastpage::class.java)
            startActivity(intent)

        }

    }
}








