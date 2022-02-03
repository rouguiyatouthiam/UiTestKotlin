package com.example.uitestkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uitestkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var biding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding = ActivityMainBinding.inflate(layoutInflater)

        //setContentView(R.layout.activity_main)
        setContentView(biding.root)

        biding.btnMainActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            println("okok")
        }
    }
}