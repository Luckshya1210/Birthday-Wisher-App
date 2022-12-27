package com.example.birthdaygreetkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class getBirthday : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_birthday)
        var TextView=findViewById(R.id.textView) as TextView
        val name=intent.getStringExtra(NAME_EXTRA);
        TextView.setText("Happy birthday\n$name!")
    }
}