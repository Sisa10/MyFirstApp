package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sumar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sumar)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val bsumar = findViewById<Button>(R.id.bSumar)
        val tresultado = findViewById<TextView>(R.id.tResultado)

        bsumar.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()
            val n2 = num2.text.toString().toIntOrNull()

            if (n1 != null && n2 != null) {
                val suma = n1 + n2 // Assuming the operation is addition based on the context. The original image shows n1-n2
                tresultado.text = suma.toString()
            } else {
                tresultado.text = getString(R.string.ingrese_un_numero_valido)
            }
        }
    }
}