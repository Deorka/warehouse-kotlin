package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        butAnswer.setOnClickListener {
            if (rgAnswers.checkedRadioButtonId == rbSphere.id){
                tvAnswer.text = "Правильно!"
            }
            else {tvAnswer.text = "Неправильно!"}
        }
        rgAnswers.checkedRadioButtonId
    }
}
