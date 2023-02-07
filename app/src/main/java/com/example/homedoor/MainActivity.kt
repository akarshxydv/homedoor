package com.example.homedoor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lgsub.setOnClickListener(){

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