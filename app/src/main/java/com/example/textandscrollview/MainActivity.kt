package com.example.textandscrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tointent = findViewById<Button>(R.id.button)
        val pointent = findViewById<Button>(R.id.button2)

        tointent.setOnClickListener {
            Toast.makeText(applicationContext, "Welcome to Tojo's Photo collection", Toast.LENGTH_SHORT).show()
            intent=Intent(applicationContext, TojoPhotos::class.java)
            startActivity(intent)
        }
        pointent.setOnClickListener {
            Toast.makeText(applicationContext, "Welcome to Photo collection", Toast.LENGTH_SHORT).show()
            intent = Intent(applicationContext, Photos::class.java)
            startActivity(intent)
        }

    }
}