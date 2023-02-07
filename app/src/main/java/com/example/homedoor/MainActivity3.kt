package com.example.homedoor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        button.setOnClickListener(){
            val ad= AlertDialog.Builder(this)
            val view=layoutInflater.inflate(R.layout.activity_custom,null)

            ad.setMessage("Register")
            ad.setView(view)
            //ad.setTitle("Sure?")
            ad.setPositiveButton("Login"){DialogInterface,which->

                //balance.text=edt1.text.toString()
                //var id="12345"
                // val pas="asdfg"
                // val user:String=edt1.text.toString()
                // val pass:String=edt2.text.toString()
                // if(user.equals(id) && pass.equals(pas)){
                //    balance.text="500000"
                // Toast.makeText(this,"Balance Shown",Toast.LENGTH_SHORT).show()
                // }else balance.text="Your username or password is wrong"

                Toast.makeText(this,"Balance Shown", Toast.LENGTH_SHORT).show()
//                val add=AlertDialog.Builder(this)
//                add.setPositiveButton("boom"){DialogInterface, which->
//                    balance.text="500000"
//                }

            }
            ad.setNegativeButton("NO"){DialogInterface,which->
                Toast.makeText(this,"Clicked NO", Toast.LENGTH_SHORT).show()
            }
            ad.setNeutralButton("Cancel",null)

            ad.create().show()
        }

        button1.setOnClickListener(){
            val intent1=Intent(this,MainActivity::class.java)
            startActivity(intent1)
        }
    }
}