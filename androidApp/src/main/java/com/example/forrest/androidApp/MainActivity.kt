package com.example.forrest.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.forrest.shared.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.tv_Counter)
        tv.text = greet()
    }
}
