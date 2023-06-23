package com.example.datatransfer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var textViewName: TextView
    private lateinit var textViewNumber: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textViewName = findViewById(R.id.textViewName)
        textViewNumber = findViewById(R.id.textViewNumber)

        val nameS = intent.getStringExtra("name")
        val numberS = intent.getStringExtra("number")

        textViewName.text = nameS
        textViewNumber.text = numberS
    }
}
