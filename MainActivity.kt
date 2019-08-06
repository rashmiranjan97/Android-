package com.example.bank

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import kotlinx.android.synthetic.main.activity2.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    internal lateinit var holder: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttont.setOnClickListener() {

            val intent = Intent(this,Screen2::class.java)
            holder = edittext1.text.toString()
            intent.putExtra("holder1", holder)
            startActivity(intent)

        }

    }
}
