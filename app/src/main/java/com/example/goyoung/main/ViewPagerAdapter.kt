package com.example.goyoung.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.goyoung.map.MapFragment
import com.example.goyoung.mypage.MyFragment

class ViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> MyFragment()
            1 -> MapFragment()
            else -> MyFragment()
        }
    }
}