package com.example.datatransfer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var number: EditText
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.nameET)
        number = findViewById(R.id.numberET)
        btn= findViewById(R.id.btn)

        btn.setOnClickListener{
            val getName = name.text.toString()
            val getNumber = number.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name", getName)
            intent.putExtra("number", getNumber)

            startActivity(intent)

        }
    }
}