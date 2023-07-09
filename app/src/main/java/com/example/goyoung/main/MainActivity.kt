package com.example.goyoung.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.viewpager2.widget.ViewPager2
import com.example.goyoung.R
import com.example.goyoung.base.BaseActivity
import com.example.goyoung.databinding.ActivityLoginBinding
import com.example.goyoung.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main), BottomNavigationView.OnNavigationItemSelectedListener {

    private var bottomNavigationView: BottomNavigationView? = null

    override fun initView() {
        binding.mainPager.adapter = ViewPagerAdapter(this)

        binding.mainPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    binding.mainNavigation.menu.getItem(position).isChecked = true
                }
            }
        )

        binding.mainNavigation.setOnNavigationItemSelectedListener(this)

        binding.mainPager.isUserInputEnabled = false

        bottomNavigationView = binding.mainNavigation
        bottomNavigationView!!.setOnNavigationItemSelectedListener(this)
        bottomNavigationView!!.selectedItemId = R.id.menu_company
    }

    override fun observeEvent() {}

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        binding.run {
            when (item.itemId) {
                R.id.menu_company -> {
                    mainPager.currentItem = 0
                    return true
                }
                R.id.menu_map -> {
                    mainPager.currentItem = 1
                    return true
                }
                R.id.menu_my -> {
                    mainPager.currentItem = 2
                    return true
                }
            }
            return false
        }
    }

}