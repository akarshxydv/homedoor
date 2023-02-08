package com.example.homedoor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lgsub.setOnClickListener(){
            val email=lgemil.text.toString().trim()
            val pass=lgpas.text.toString().trim()
            if(email.isEmpty() || pass.isEmpty()){
                Toast.makeText(this,"Please Enter Email and Password",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this,"Door is open",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,MainActivity2:: class.java)
            intent.putExtra("data",lgemil.text.toString())
            startActivity(intent)
        }

        lgnot.setOnClickListener(){
            val intent3=Intent(this,MainActivity3::class.java)
            startActivity(intent3)
        }
    }
}