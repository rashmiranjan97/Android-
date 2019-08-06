package com.example.bank

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity2.*

class Screen2 : AppCompatActivity(){

    private lateinit var superr : EditText
    private lateinit var superr1 : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity2)
        val superr = findViewById<TextView>(R.id.edittext3)
        val superr1 = findViewById<TextView>(R.id.edittext4)

       val holder = intent.getStringExtra("holder")
       val holder1 = intent.getStringExtra("holder1")
        superr.text = holder
        superr1.text = holder1

    }
}
