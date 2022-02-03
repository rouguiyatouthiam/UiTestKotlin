package com.example.uitestkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uitestkotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {


    private  lateinit var biding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding = ActivitySecondBinding.inflate(layoutInflater)

        //setContentView(R.layout.activity_second)
        setContentView(biding.root)
        biding.btn.setOnClickListener(){
            println("BACK")
            onBackPressed()


        }
    }
}