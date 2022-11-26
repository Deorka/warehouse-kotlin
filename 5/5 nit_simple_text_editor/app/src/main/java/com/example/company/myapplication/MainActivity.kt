package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s.toString() == textView.text.toString()){unsaved_changes_view.text = "All changes saved"}
                else {unsaved_changes_view.text = "Unsaved changes"}
                var s = Regex("""[^A-Za-z0-9_а-яА-я]""").split(s.toString()).filter { it != "" }
                stats_view.text = s.size.toString()
            }
        })
        save_button.setOnClickListener {
            textView.text = editText.text
            unsaved_changes_view.text = "All changes saved"
        }
        load_button.setOnClickListener {
            editText.setText(textView.text)
            unsaved_changes_view.text = "All changes saved"
            editText.setSelection(editText.length())
        }
        clear_button.setOnClickListener {
            editText.text.clear()
        }
    }
}
