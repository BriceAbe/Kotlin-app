package com.training.lecab.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.training.lecab.R


class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ViewHolder>(){

    class ViewHolder(view:View): RecyclerView.ViewHolder(view){
        val item = view.findViewById<ImageView>(R.id.imageView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view = LayoutInflater.from( parent.context).inflate(R.layout.item_vertical_plant,parent,  false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
      return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

}