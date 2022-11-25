package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        add.setOnClickListener {
            try {
                answer.setText("${arg1.text.toString().toInt() + arg2.text.toString().toInt()}")
            } catch (e: NumberFormatException) {
                answer.setText("Input Error")
            }
        }
        subtr.setOnClickListener {
            try {
                answer.setText("${arg1.text.toString().toInt() - arg2.text.toString().toInt()}")
            } catch (e: NumberFormatException) {
                answer.setText("Input Error")
            }
        }
        mul.setOnClickListener { try {
            answer.setText("${arg1.text.toString().toInt() * arg2.text.toString().toInt()}")
        } catch (e: NumberFormatException) {
            answer.setText("Input Error")
        } }
        divide.setOnClickListener {
            try {
                answer.setText("${arg1.text.toString().toInt() / arg2.text.toString().toInt()}")
            } catch (e: NumberFormatException) {
                answer.setText("Input Error")
            } catch (e: ArithmeticException) {
                answer.setText("Div by zero")
            }
        }

    }
}
