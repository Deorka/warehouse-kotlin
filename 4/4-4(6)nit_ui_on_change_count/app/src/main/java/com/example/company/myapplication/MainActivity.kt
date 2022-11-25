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
        var i = 0

        editText.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Log.d("TAG", "ыыыыыы ${s}")
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("TAG", "ыыыыыы ${s}")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                i+=1
                textView.setText(i.toString())
                Log.d("TAG", "ыыыыыы ${s}")
            }

        })

    }
}
