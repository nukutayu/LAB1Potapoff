package com.fokinar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById(R.id.textView) as TextView

        val button = findViewById(R.id.button) as Button
        val textWork = TextWork()

        button.setOnClickListener {
        textView.setText("${getString(R.string.output)}\n\nИскомая буква: ${textWork.fLetter}\nСлова: ${textWork.mWords.joinToString()}")
        }
    }
}