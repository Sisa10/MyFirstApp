package com.example.myfirstapp

import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Operaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operaciones)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val bsumar = findViewById<Button>(R.id.bSumar)
        val brestar = findViewById<Button>(R.id.bRestar)
        val bmultiplicar = findViewById<Button>(R.id.bMultiplicar)
        val bdividir = findViewById<Button>(R.id.bDividir)
        val tresultado = findViewById<TextView>(R.id.tResultado)

        // Función para mostrar el resultado con animación fade in
        fun mostrarResultado(texto: String) {
            tresultado.text = texto
            val fadeIn = AlphaAnimation(0f, 1f)
            fadeIn.duration = 600
            fadeIn.fillAfter = true
            tresultado.startAnimation(fadeIn)
        }

        bsumar.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()
            val n2 = num2.text.toString().toIntOrNull()

            if (n1 != null && n2 != null) {
                val suma = n1 + n2
                mostrarResultado(suma.toString())
            } else {
                mostrarResultado(getString(R.string.ingrese_un_numero_valido))
            }
        }

        brestar.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()
            val n2 = num2.text.toString().toIntOrNull()

            if (n1 != null && n2 != null) {
                val resta = n1 - n2
                mostrarResultado(resta.toString())
            } else {
                mostrarResultado(getString(R.string.ingrese_un_numero_valido))
            }
        }

        bmultiplicar.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()
            val n2 = num2.text.toString().toIntOrNull()

            if (n1 != null && n2 != null) {
                val multiplicar = n1 * n2
                mostrarResultado(multiplicar.toString())
            } else {
                mostrarResultado(getString(R.string.ingrese_un_numero_valido))
            }
        }

        bdividir.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()
            val n2 = num2.text.toString().toIntOrNull()

            if (n1 != null && n2 != null) {
                if (n2 == 0) {
                    mostrarResultado(getString(R.string.ingrese_un_numero_diferente_de_cero))
                } else {
                    val dividir = n1 / n2
                    mostrarResultado(dividir.toString())
                }

            } else {
                mostrarResultado(getString(R.string.ingrese_un_numero_valido))
            }
        }
    }
}
