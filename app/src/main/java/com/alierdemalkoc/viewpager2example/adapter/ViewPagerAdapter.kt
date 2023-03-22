package com.alierdemalkoc.viewpager2example.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.alierdemalkoc.viewpager2example.view.fragment.LosersFragment
import com.alierdemalkoc.viewpager2example.view.fragment.WinnersFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0){
            WinnersFragment()
        } else {
            LosersFragment()
        }
    }
}