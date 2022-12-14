package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (editText.isFocused) {
                    try{
                        editText2.setText((s.toString().toFloat() / 39370.0).toString())
                        status.text = ""
                        }catch (e:Exception){
                        status.text = "error"
                    }
                }
            }

        })
        editText2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (editText2.isFocused) {
                    try{
                        editText.setText((s.toString().toFloat() * 39370.0).toString())
                        status.text = ""
                    }catch (e:Exception){
                        status.text = "error"
                }}
            }

        })
    }
}
