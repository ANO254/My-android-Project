package com.example.my_android_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class Signup : AppCompatActivity() {
    lateinit var buttonsignup:Button
    lateinit var edtsignfirstname:TextInputEditText
    lateinit var edtsignlastname:TextInputEditText
    lateinit var edtsignemail:TextInputEditText
    lateinit var edtpass:TextInputEditText
    lateinit var edtconfpass:TextInputEditText
    lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        buttonsignup=findViewById(R.id.btnsignup)
        edtsignfirstname=findViewById(R.id.edtsignfirstname)
        edtsignlastname=findViewById(R.id.edtsignlastname)
        edtsignemail=findViewById(R.id.edtsignemail)
        edtpass=findViewById(R.id.edtpass)
        edtconfpass=findViewById(R.id.edtconfpass)
        auth= FirebaseAuth.getInstance()




        buttonsignup.setOnClickListener {
            val signup = Intent(this,Booking_page::class.java)
            startActivity(signup)
        }
        buttonsignup.setOnClickListener {
            signupuser()
        }
    }


    private fun signupuser(){

        val email=edtsignemail.text.toString()
        val pass=edtpass.text.toString()
        val confirmpass=edtconfpass.text.toString()



        if(email.isBlank()||pass.isBlank()||confirmpass.isBlank()){
            Toast.makeText(this,"Please password and email cant be blank", Toast.LENGTH_LONG).show()
            return

        }else if (confirmpass != pass){
            Toast.makeText(this,"Password do not match", Toast.LENGTH_LONG).show()
            return
        }
     auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){

         if (it.isSuccessful){
                Toast.makeText(this,"Signed up Successfully", Toast.LENGTH_LONG).show()
                startActivity(Intent(this,Booking_page::class.java))
                finish()

            }else{
                Toast.makeText(this,"Signup failed", Toast.LENGTH_LONG).show()
            }
        }



    }
}