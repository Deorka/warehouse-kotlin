package com.example.company.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.math.BigInteger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        convertButton.setOnClickListener {
            try {
                val c =  number.text.toString().toInt()
                if ((c == 0) && (systemOfCalculus.text.toString().toInt() < 37)) { convertResult.text = c.toString()}
                else {
                    convertResult.text = c.toString(systemOfCalculus.text.toString().toInt())
                }
            }
            catch (e: Exception){
                convertResult.text = "Error"
            }
            Log.d("TAG", "${number.text}   ${systemOfCalculus.text}    ${convertResult.text}")
        }
    }
}
