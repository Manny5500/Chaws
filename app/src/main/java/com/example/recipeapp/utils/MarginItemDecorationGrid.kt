package com.example.recipeapp.utils

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.annotation.DimenRes
import androidx.recyclerview.widget.RecyclerView

class MarginItemDecorationGrid(context: Context, @DimenRes private val marginInDp: Int) : RecyclerView.ItemDecoration() {

    private val margin: Int = context.resources.getDimensionPixelSize(marginInDp)

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        if (parent.getChildAdapterPosition(view)%2 == 0){
            outRect.right = margin
        }else{
            outRect.left = margin
        }

    }


}