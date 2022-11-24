package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.company.lib.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("tag1", "DEBUG")
        Log.w("tag2",  "WARNING")
        Log.e("tag3",  "ERROR")
        Log.i("tag4",  "INFO")
        Log.printAnswer()
    }
}
