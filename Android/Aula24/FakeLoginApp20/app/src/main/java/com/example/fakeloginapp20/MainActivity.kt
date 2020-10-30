package com.example.fakeloginapp20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)

        val pager = findViewById<ViewPager>(R.id.viewPager)
        val tab = findViewById<TabLayout>(R.id.tabLayout)

        tab.setupWithViewPager(pager)

        val fragments = listOf(SignInFragment(), SignUpFragment())
        val titles = listOf("Sign In", "Sign Up")

        pager.adapter = ViewPagerAdapter(fragments, titles, supportFragmentManager)

    }
}