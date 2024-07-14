package com.example.recipeapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeapp.R
import com.example.recipeapp.SimpleAdapter
import com.example.recipeapp.adapter.ContentAdapter
import com.example.recipeapp.adapter.NewAdapter
import com.example.recipeapp.adapter.TrendAdapter
import com.example.recipeapp.databinding.FragmentHomeBinding
import com.example.recipeapp.utils.MarginItemDecoration
import com.example.recipeapp.utils.MarginItemDecorationVertical

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val recyclerView1 = binding.recyclerNew
        recyclerView1.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.adapter = NewAdapter(listOf("Item 1-1", "Item 1-2", "Item 1-3",
            "Item 1-1", "Item 1-2", "Item 1-3"))
        recyclerView1.addItemDecoration(MarginItemDecoration(requireContext(), R.dimen.margin))

        val recyclerView2 = binding.recyclerTrending
        recyclerView2.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = TrendAdapter(listOf("Item 2-1", "Item 2-2", "Item 2-3",
            "Item 2-1", "Item 2-2", "Item 2-3"))
        recyclerView2.addItemDecoration(MarginItemDecoration(requireContext(), R.dimen.margin))


        val recyclerView3 = binding.recyclerContent
        recyclerView3.layoutManager = LinearLayoutManager(requireContext())
        recyclerView3.adapter = ContentAdapter(listOf("Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3"))
        recyclerView3.addItemDecoration(MarginItemDecorationVertical(requireContext(), R.dimen.bottom_margin))

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}