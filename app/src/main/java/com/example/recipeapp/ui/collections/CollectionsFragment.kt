package com.example.recipeapp.ui.collections

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeapp.R
import com.example.recipeapp.adapter.MyRecipeAdapter
import com.example.recipeapp.databinding.FragmentCollectionsBinding
import com.example.recipeapp.utils.MarginItemDecorationVertical

class CollectionsFragment : Fragment() {

    private var _binding: FragmentCollectionsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val collectionsViewModel =
            ViewModelProvider(this).get(CollectionsViewModel::class.java)

        _binding = FragmentCollectionsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerCollections = binding.recyclerCollections
        recyclerCollections.layoutManager = LinearLayoutManager(requireContext())
        recyclerCollections.adapter = MyRecipeAdapter(listOf("", "", "", "", "", "", "",
            "", "", "", "", "", "", "","", "", "", "", "", "", ""))
        recyclerCollections.addItemDecoration(MarginItemDecorationVertical(requireContext(), R.dimen.bottom_margin))
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}