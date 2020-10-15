package com.example.sibiappz_ricacrdo_proyect.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sibiappz_ricacrdo_proyect.R

class TestAdapter (context: Context) : RecyclerView.Adapter<ItemViewHolder>(){

    private val layoutInflater = LayoutInflater.from(context)
    private var itemList = listOf<Student>()

    fun setData(list: List<Student>){
        this.itemList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = layoutInflater.inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val student = itemList[position]
        holder.bind(student)
    }
}
