package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


fun isPrime(n: Int): Boolean {
    if (n < 2) return false // Необходимо, так как 1 -- не простое число
    for (m in 2..n - 1) {
        if (n % m == 0) return false
    }
    return true
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkBtn.setOnClickListener {
            try {
                if (isPrime(editText.text.toString().toInt())){
                    textView.setText("prime")
                }
                else {
                    textView.setText("not prime")
                }

            } catch (e: Exception){
                textView.setText("error")
            }

        }


    }
}
