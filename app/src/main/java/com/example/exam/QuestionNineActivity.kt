package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QuestionNineActivity : AppCompatActivity() {
    private var btn:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_nine)
        setupView()
    }

    private fun setupView() {
        btn=findViewById(R.id.btn)
    }
}