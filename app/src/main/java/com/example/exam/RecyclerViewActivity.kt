package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var btnDelete: Button? = null
    private var btnAdd: Button? = null
    val adapter = Adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        setupView()
        setupAdapter()
    }

    private fun setupView() {
        recyclerView = findViewById(R.id.recyclerview)
        btnDelete = findViewById(R.id.btnDelete)
        btnAdd = findViewById(R.id.btnAdd)
    }

    private fun setupAdapter() {
        recyclerView?.adapter = adapter
        adapter.update(getData())

    }

    private fun getData(): ArrayList<DataClass> {
        val list = arrayListOf<DataClass>()
        for (i in 1..50) {
            list.add(DataClass("title $i", "love $i"))
        }
        return list
    }
}