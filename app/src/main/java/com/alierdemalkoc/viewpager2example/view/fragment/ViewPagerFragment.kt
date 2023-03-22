package com.alierdemalkoc.viewpager2example.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alierdemalkoc.viewpager2example.R
import com.alierdemalkoc.viewpager2example.adapter.ViewPagerAdapter
import com.alierdemalkoc.viewpager2example.databinding.FragmentViewPagerBinding
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!

    private lateinit var demoCollectionPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // ViewPager2 implementation
        demoCollectionPagerAdapter = ViewPagerAdapter(requireActivity())
        binding.viewPager.adapter = demoCollectionPagerAdapter
        // TabLayout implementation
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            if (position == 0){
                tab.text = "Winners"
            } else if (position == 1){
                tab.text = "Losers"
            }
        }.attach()
    }

}