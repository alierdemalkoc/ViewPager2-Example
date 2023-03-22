package com.alierdemalkoc.viewpager2example.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alierdemalkoc.viewpager2example.R
import com.alierdemalkoc.viewpager2example.databinding.FragmentLosersBinding


class LosersFragment : Fragment() {

    private var _binding: FragmentLosersBinding? = null
    private val binding get() =_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLosersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loserDetailButton.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key", "Loser Teams")
            findNavController().navigate(R.id.actionPagerToDetail,bundle)
        }
    }

}