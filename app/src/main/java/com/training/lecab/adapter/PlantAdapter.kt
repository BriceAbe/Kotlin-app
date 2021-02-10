package com.training.lecab.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.training.lecab.R

class PlantAdapter(private val layoutId: Int) : RecyclerView.Adapter<PlantAdapter.ViewHolder>() {

    // creer la boite pour ranger tous les compostant

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val plantImage= view.findViewById<ImageView>(R.id.image_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(layoutId, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
   return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}