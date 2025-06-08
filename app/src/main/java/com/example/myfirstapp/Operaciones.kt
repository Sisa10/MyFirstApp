package com.example.myfirstapp

import android.os.Bundle
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

        bsumar.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()
            val n2 = num2.text.toString().toIntOrNull()

            if (n1 != null && n2 != null) {
                val suma = n1 + n2
                tresultado.text = suma.toString()
            } else {
                tresultado.text = getString(R.string.ingrese_un_numero_valido)
            }
        }

        brestar.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()
            val n2 = num2.text.toString().toIntOrNull()

            if (n1 != null && n2 != null) {
                val resta = n1 - n2
                tresultado.text = resta.toString()
            } else {
                tresultado.text = getString(R.string.ingrese_un_numero_valido)
            }
        }

        bmultiplicar.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()
            val n2 = num2.text.toString().toIntOrNull()

            if (n1 != null && n2 != null) {
                val multiplicar = n1 * n2
                tresultado.text = multiplicar.toString()
            } else {
                tresultado.text = getString(R.string.ingrese_un_numero_valido)
            }
        }

        bdividir.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()
            val n2 = num2.text.toString().toIntOrNull()

            if (n1 != null && n2 != null) {
                if (n2 == 0){
                    tresultado.text = getString(R.string.ingrese_un_numero_diferente_de_cero)
                }else {
                    val dividir = n1 / n2 // Assuming the operation is addition based on the context. The original image shows n1-n2
                    tresultado.text = dividir.toString()
                }

            } else {
                tresultado.text = getString(R.string.ingrese_un_numero_valido)
            }
        }
    }


}