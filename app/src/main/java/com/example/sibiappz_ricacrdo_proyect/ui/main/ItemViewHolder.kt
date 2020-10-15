package com.example.sibiappz_ricacrdo_proyect.ui.main

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class ItemViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView){
    private val textView = itemView.title

    fun bind(student : Student){
        textView.text = student.name
    }
}