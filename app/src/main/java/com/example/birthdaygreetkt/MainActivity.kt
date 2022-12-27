package com.example.birthdaygreetkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun handleclick(view: View) {
        var editText=findViewById(R.id.editText) as EditText
        val name=editText.editableText.toString()
        val intent=Intent(this,getBirthday::class.java)
        intent.putExtra(getBirthday.NAME_EXTRA,name);
        startActivity(intent);
//        Toast.makeText(this,"Name is $name",Toast.LENGTH_LONG).show()
    }
}