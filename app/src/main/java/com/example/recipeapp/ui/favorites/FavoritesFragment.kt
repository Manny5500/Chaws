package com.example.recipeapp.ui.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeapp.R
import com.example.recipeapp.adapter.ContentAdapter
import com.example.recipeapp.adapter.FavoritesAdapter
import com.example.recipeapp.databinding.FragmentFavoritesBinding
import com.example.recipeapp.utils.MarginItemDecorationVertical

class FavoritesFragment : Fragment() {

    private var _binding: FragmentFavoritesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(FavoritesViewModel::class.java)

        _binding = FragmentFavoritesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recylerFavorites = binding.recyclerFavorites
        recylerFavorites.layoutManager = LinearLayoutManager(requireContext())
        recylerFavorites.adapter = FavoritesAdapter(listOf("Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3"))
        recylerFavorites.addItemDecoration(MarginItemDecorationVertical(requireContext(), R.dimen.bottom_margin))

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}