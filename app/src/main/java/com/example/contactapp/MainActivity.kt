package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){
        buttonimage.setOnClickListener(){
            buttonPress()
        }
    }
    private fun buttonPress(){
        val intent = Intent(this,FirstActivity::class.java)
        startActivity(intent)
    }
}
