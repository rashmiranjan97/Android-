package com.example.bank

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import kotlinx.android.synthetic.main.activity2.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var holder: String
    private lateinit var holder1: String
    private lateinit var user :EditText
    private lateinit var password :EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        
        user = findViewById(R.id.edittext1)
        password = findViewById(R.id.edittext2)


        buttont.setOnClickListener() {

            val intent = Intent(this,Screen2::class.java)
            holder = user.text.toString()
            holder1 = password.text.toString()
            intent.putExtra("holder", holder)
            intent.putExtra("holder1", holder1)
            startActivity(intent)

        }

    }
}
