package com.example.recipeapp.adapter

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.R
import com.example.recipeapp.databinding.ItemFavoriteBinding

class FavoritesAdapter(private val items: List<String>) :
    RecyclerView.Adapter<FavoritesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemFavoriteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.imgHeart.setOnClickListener{
            holder.binding.imgHeart.setImageResource(R.drawable.heart__1_)
            holder.binding.imgHeart.setColorFilter(Color.parseColor("#ff0000"), PorterDuff.Mode.SRC_IN)
            animateHeart(holder.binding.imgHeart)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun animateHeart(imageView: ImageView){
        val scaleDown = ObjectAnimator.ofPropertyValuesHolder(
            imageView,
            PropertyValuesHolder.ofFloat("scaleX", 0.7f),
            PropertyValuesHolder.ofFloat("scaleY", 0.7f)
        ).apply {
            duration = 300
            //repeatCount = ObjectAnimator.INFINITE
            repeatCount = 1
            repeatMode = ObjectAnimator.REVERSE
        }


        scaleDown.start()
    }

    inner class ViewHolder(val binding:ItemFavoriteBinding) : RecyclerView.ViewHolder(binding.root)
}


