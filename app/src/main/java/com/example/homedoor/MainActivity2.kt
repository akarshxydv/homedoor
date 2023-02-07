package com.example.homedoor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var data =intent.getStringExtra("data")
        a2txt1.setText("HI Your Email id is $data \n have a great dat").toString()

    }
}