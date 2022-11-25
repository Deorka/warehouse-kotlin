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

        editText.addTextChangedListener(object : TextWatcher{
            var c = 0
            override fun afterTextChanged(s: Editable?) {
                Log.d("TAG", "ыыыыыы ${s}")
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("TAG", "ыыыыыы ${s}")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("TAG", "ыыыыыы ${s}")

                if (s.toString().contains("question")){
                    c+=1
                    editText.setText(s.toString().replace("question", "answer"))
                }
                else if (s.toString().contains("request")){
                    c+=1
                    editText.setText(s.toString().replace("request", "response"))
                }
                else if (s.toString().contains("problem")){
                    c+=1
                    editText.setText(s.toString().replace("problem", "task"))
                }
                editText.setSelection(editText.length())
                textView.setText(c.toString())
            }

        })

    }
}
