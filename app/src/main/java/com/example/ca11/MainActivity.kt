package com.example.ca11

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var e1: EditText
    lateinit var e2: EditText
    lateinit var e3: EditText
    lateinit var bt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        e1=findViewById(R.id.e1)
        e2=findViewById(R.id.e2)
        e3=findViewById(R.id.e3)
        bt=findViewById(R.id.bt1)
        bt.setOnClickListener {
            var t= e1.text.toString().toInt()+e2.text.toString().toInt()+e3.text.toString().toInt()
            Toast.makeText(this,"Cgpa is "+t, Toast.LENGTH_SHORT).show()
        }

    }
}
