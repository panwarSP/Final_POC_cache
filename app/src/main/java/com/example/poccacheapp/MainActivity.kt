package com.example.poccacheapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val i = intent
        val url1 = i.getStringExtra("URL")
        val url2 = i.getStringExtra("URL")
    }
}