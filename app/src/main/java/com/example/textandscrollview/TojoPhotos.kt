package com.example.textandscrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class TojoPhotos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tojo_photos)

        val inte = findViewById<Button>(R.id.button3)

        inte.setOnClickListener {
            Toast.makeText(applicationContext, "Returning To Home" ,Toast.LENGTH_SHORT).show()

            intent=Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}