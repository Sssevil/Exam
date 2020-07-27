package com.example.exam

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

 class Adapter: RecyclerView.Adapter<AdapterVH>() {
    private var data= arrayListOf<DataClass>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterVH {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return AdapterVH(view)
    }

    override fun getItemCount()=data.size


    override fun onBindViewHolder(holder: AdapterVH, position: Int) {
        holder.bind(data[position])

    }

     fun update(data:ArrayList<DataClass>){
         this.data=data
         notifyDataSetChanged()
     }
}