package com.example.bank

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity2.*

class Screen2 : AppCompatActivity(){

    internal lateinit var superr : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity2)
        val superr = findViewById<TextView>(R.id.edittext3)

       val holder = intent.getStringExtra("holder1")
        superr.text = holder

    }
}