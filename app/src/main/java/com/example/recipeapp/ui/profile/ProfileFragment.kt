package com.example.recipeapp.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeapp.R
import com.example.recipeapp.adapter.ContentAdapter
import com.example.recipeapp.adapter.FollowingAdapter
import com.example.recipeapp.adapter.HistoryAdapter
import com.example.recipeapp.databinding.FragmentProfileBinding
import com.example.recipeapp.utils.MarginItemDecoration
import com.example.recipeapp.utils.MarginItemDecorationVertical

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(ProfileViewModel::class.java)

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*
        val textView: TextView = binding.textNotifications
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/

        val recyclerHistory = binding.recyclerHistory
        recyclerHistory.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerHistory.adapter = HistoryAdapter(listOf("Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3"))
        recyclerHistory.addItemDecoration(MarginItemDecoration(requireContext(), R.dimen.margin))

        val recyclerFollowing = binding.recyclerFollowing
        recyclerFollowing.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerFollowing.adapter = FollowingAdapter(listOf("Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3",
            "Item 3-1", "Item 3-2", "Item 3-3"))
        recyclerFollowing.addItemDecoration(MarginItemDecoration(requireContext(), R.dimen.margin))
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}