package com.example.findbyview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.findbyview.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val boton = findViewById<Button>(id.button)
        val texto = findViewById<TextView>(id.textView)
        val campo = findViewById<EditText>(id.editText)

        boton.setOnClickListener(){
            texto.text = campo.text.toString()
        }
    }
}