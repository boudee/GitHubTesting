package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("TAG","TRIAL SAMPLE")

        Log.i("TAG","STASH")
        
        Log.i("TAG","HELLO WORLD THIRD BRANCH")

        Log.i("TAG","CHERRY PICK")
    }
}