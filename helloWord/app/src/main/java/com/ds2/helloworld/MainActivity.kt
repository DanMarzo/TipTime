package com.ds2.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textfield.TextInputEditText
import android.widget.EditText


const val EXTRA_MESSAGE = "com.ds2.helloworld.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMensagem(view: View)
    {
        val editText = findViewById<TextInputEditText>(R.id.textInputEditText)
        // findViewById<Id Do <elemento/ TIPO DO ELEMENTO>(R= Raiz que é o padrao.id = que guarda todos os id.NOME DO id)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}