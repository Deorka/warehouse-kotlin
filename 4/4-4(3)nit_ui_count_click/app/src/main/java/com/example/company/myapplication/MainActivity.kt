package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i = 0
        //textView.setOnClickListener { textView.setText(textView.text.toString().toInt() + 1) }
        textView.setOnClickListener { textView.setText("${++i}")}


    }
}
