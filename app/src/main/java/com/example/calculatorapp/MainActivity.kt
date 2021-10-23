package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.typeField)
        val editText2 = findViewById<EditText>(R.id.typeField2)
        val textView = findViewById<TextView>(R.id.textView)
        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)

        addButton.setOnClickListener {
            val tempNum = editText.text.toString()
            val tempNum2 = editText2.text.toString()
            val temp = (tempNum.toInt() + tempNum2.toInt()).toString()
            textView.text = temp
        }
        subtractButton.setOnClickListener {
            val tempNum = editText.text.toString()
            val tempNum2 = editText2.text.toString()
            val temp = (tempNum.toInt() - tempNum2.toInt()).toString()
            textView.text = temp
        }
        multiplyButton.setOnClickListener {
            val tempNum = editText.text.toString()
            val tempNum2 = editText2.text.toString()
            val temp = (tempNum.toInt() * tempNum2.toInt()).toString()
            textView.text = temp
        }
        divideButton.setOnClickListener {
            val tempNum = editText.text.toString()
            val tempNum2 = editText2.text.toString()
            val temp = (tempNum.toInt() / tempNum2.toInt()).toString()
            textView.text = temp
        }


    }
}