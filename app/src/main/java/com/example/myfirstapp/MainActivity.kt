package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_activity)
        val miBoton: Button = findViewById(R.id.click)
        miBoton.setOnClickListener {
            Toast.makeText(this, "Dar Click", Toast.LENGTH_SHORT).show()

            try {
                val intent = Intent(this, Operaciones::class.java)
                startActivity(intent)

            } catch (e: Exception) {
                Toast.makeText(this,"Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}