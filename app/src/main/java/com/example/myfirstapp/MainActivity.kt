package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstapp.ui.theme.MyFirstAppTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_activity)
        val miBoton: Button = findViewById(R.id.click)
        miBoton.setOnClickListener {
            Toast.makeText(this, "Dar Click", Toast.LENGTH_SHORT).show()

            try {
                val intent = Intent(this, Sumar::class.java)
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(this,"Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello5 $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstAppTheme {
        Greeting("Android")
    }
}