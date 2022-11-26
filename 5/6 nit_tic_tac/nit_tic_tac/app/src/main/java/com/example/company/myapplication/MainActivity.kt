package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    val toChooseList: List<String> = listOf("", "X", "0")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinner: Spinner = findViewById(R.id.spinner11) as Spinner
        //Создаем adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, toChooseList)
        // Устанавливаем layout, который будем использовать при появлении списка вариантов
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // устанавливаем связь между spinner и adapter
        spinner.setAdapter(adapter)
        // Привязываем методы onItemSelected и onNothingSelected к spinner
        spinner.setOnItemSelectedListener(this)

    }
    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {}

    override fun onNothingSelected(arg0: AdapterView<*>) {}
}
