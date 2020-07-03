package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        init()
    }

    private fun init(){
        buttonNumber.setOnClickListener(){
            buttonPress()
        }
        buttonAdress.setOnClickListener(){
            buttonPress()
        }
        buttonMail.setOnClickListener(){
            buttonPress()
        }
    }
    private fun buttonPress(){
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
}
