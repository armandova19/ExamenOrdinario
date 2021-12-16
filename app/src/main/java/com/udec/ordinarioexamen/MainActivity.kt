package com.udec.ordinarioexamen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text2 = findViewById<EditText>(R.id.text2)
        val text1 = findViewById<EditText>(R.id.text1)
        val next = findViewById<Button>(R.id.save_button)


        next.setOnClickListener(){
            if (text1.text.isEmpty() && text2.text.isEmpty()){
                Toast.makeText(this, "Ingresa los datos", Toast.LENGTH_SHORT).show()
            }

            val name = text1.text
            Toast.makeText(this, "Bienvenido $name", Toast.LENGTH_SHORT).show()
            val intento12 = Intent(this, MainActivity3::class.java)
            startActivity(intento12)

        }

    }
}