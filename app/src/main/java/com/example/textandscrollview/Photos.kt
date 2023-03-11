package com.example.textandscrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Photos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photos)
        val intes = findViewById<Button>(R.id.button4)

        intes.setOnClickListener {
            Toast.makeText(applicationContext, "Returning To Home" , Toast.LENGTH_SHORT).show()

            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}