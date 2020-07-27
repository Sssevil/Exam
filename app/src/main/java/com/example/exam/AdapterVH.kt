package com.example.exam

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class AdapterVH(view: View): RecyclerView.ViewHolder(view) {
    fun bind(item:DataClass){
        itemView.txt1.text=item.title
        itemView.txt2.text=item.title1
    }
}