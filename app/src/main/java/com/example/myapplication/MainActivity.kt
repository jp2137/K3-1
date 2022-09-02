package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button1).setOnClickListener {
            if(findViewById<ImageView>(R.id.imageView).isVisible === true) {
                findViewById<ImageView>(R.id.imageView).visibility = View.INVISIBLE
                findViewById<Button>(R.id.button1).text = "pokaz"
            }
            else if(findViewById<ImageView>(R.id.imageView).isVisible === false) {
                findViewById<ImageView>(R.id.imageView).visibility = View.VISIBLE
                findViewById<Button>(R.id.button1).text = "ukryj"
            }
        }
    }
}