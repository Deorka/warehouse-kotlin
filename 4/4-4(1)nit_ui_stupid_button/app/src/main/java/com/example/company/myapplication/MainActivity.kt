package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button.setOnClickListener { Log.d("TAG", "button1 was presssed") }
        button.setOnClickListener { button.setText("Button was pressed") }
    }

    //<View>.setOn<button>Listener
    //button.setOnClick.Listener(::onClickListener)
    //button.setOnClick.Listener{v:View -> Log.d(" ")}

}
