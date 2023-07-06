package com.example.my_android_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LogIn : AppCompatActivity() {
    lateinit var buttonlogin:Button
    lateinit var emaillog:EditText
    lateinit var passwordlog:EditText
    lateinit var auth:FirebaseAuth
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        buttonlogin=findViewById(R.id.login)
        emaillog=findViewById(R.id.edtgmail)
        passwordlog=findViewById(R.id.logpass)
        auth= FirebaseAuth.getInstance()






        buttonlogin.setOnClickListener {
            loginuser()
        }
    }

    private fun loginuser(){

            val email=emaillog.text.toString()
            val pass=passwordlog.text.toString()
            if (email.isBlank()||pass.isBlank()){
                Toast.makeText(this,"Password and email can not be blank",Toast.LENGTH_LONG).show()
                return
             }

            auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
                if (it.isSuccessful){
                    Toast.makeText(this,"Successfully Logged in", Toast.LENGTH_LONG).show()
                    val intent = Intent(this,Booking_page::class.java)
                    startActivity(intent)

                }else{
                    Toast.makeText(this,"Log in failed", Toast.LENGTH_LONG).show()
                }
            }
    }

}
