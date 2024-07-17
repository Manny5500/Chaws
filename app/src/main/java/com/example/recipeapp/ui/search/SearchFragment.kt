package com.example.recipeapp.ui.search

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recipeapp.R
import com.example.recipeapp.adapter.CategoryAdapter
import com.example.recipeapp.databinding.FragmentSearchBinding
import com.example.recipeapp.model.Category
import com.example.recipeapp.utils.MarginItemDecoration
import com.example.recipeapp.utils.MarginItemDecorationGrid

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val searchViewModel =
            ViewModelProvider(this).get(SearchViewModel::class.java)

        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerCategory = binding.recyclerCategory
        recyclerCategory.layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerCategory.adapter = CategoryAdapter(listOf(
            Category("Appetizers", R.drawable.appetizergogo),
            Category("Main Course", R.drawable.category_maindish),
            Category("Side Dishes", R.drawable.category_sidedish),
            Category("Desserts", R.drawable.dessert),
            Category("Snacks", R.drawable.category_snacks),
            Category("Soups", R.drawable.appetizergogo),
            Category("Drinks", R.drawable.appetizergogo),
            Category("Breakfast", R.drawable.appetizergogo),
            Category("Lunch", R.drawable.lunch),
            Category("Dinner", R.drawable.appetizergogo),
        ))
        recyclerCategory.addItemDecoration(MarginItemDecorationGrid(requireContext(), R.dimen.margin))


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}