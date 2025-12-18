package com.example.day2activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val onClickMe: Button = findViewById(R.id.btnClickMe)

        onClickMe.setOnClickListener {
            Toast.makeText(this, "Enjoy learning!", Toast.LENGTH_LONG).show()

        }
    }
}