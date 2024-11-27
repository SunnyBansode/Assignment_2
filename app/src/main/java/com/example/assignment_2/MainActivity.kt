package com.example.assignment_2

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference to UI components
        val textView: TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)

        // Button 1: Change Text
        button1.setOnClickListener {
            textView.text = "Text has been changed!"
        }

        // Button 2: Change Height
        button2.setOnClickListener {
            textView.layoutParams.height = 300
            textView.requestLayout()
        }

        // Button 3: Center Text
        button3.setOnClickListener {
            textView.gravity = Gravity.CENTER
        }

        // Button 4: Reset Text
        button4.setOnClickListener {
            textView.text = "Hello! I am a TextView."
            textView.setBackgroundColor(Color.parseColor("#E3F2FD")) // Reset background color
        }

        // Button 5: Change Background
        button5.setOnClickListener {
            textView.setBackgroundColor(Color.parseColor("#FFC107")) // Set background to yellow
        }
    }
}
