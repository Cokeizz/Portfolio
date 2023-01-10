package com.example.chonkeaw.ui.feed.model

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.chonkeaw.R

class adt(val data: List<rv_data>):RecyclerView.Adapter<viewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val rv_row = LayoutInflater.from(parent.context).inflate(R.layout.rv_row,parent,false)
        val holder = viewholder(rv_row)
        return holder
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.apply {
           

            imgFileIcon.setImageResource(data[position].fileicon)
            tvFileType.text = data[position].filetype
            tvFileDescription.text = data[position].filedescription


        }
    }

    override fun getItemCount(): Int = data.size




}