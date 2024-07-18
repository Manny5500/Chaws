package com.example.recipeapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.databinding.ItemProceduresBinding

class ProceduresAdapter(val items: List<String>) : RecyclerView.Adapter<ProceduresAdapter.ViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProceduresAdapter.ViewHolder {
        val binding = ItemProceduresBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProceduresAdapter.ViewHolder, position: Int) {
        holder.binding.textProcedures.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
    inner class ViewHolder(val binding: ItemProceduresBinding): RecyclerView.ViewHolder(binding.root)
}