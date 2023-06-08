package com.example.android5lesson4dz.presentation.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.android5lesson4dz.presentation.ui.fragments.anime.AnimeFragment
import com.example.android5lesson4dz.presentation.ui.fragments.manga.MangaFragment

class ViewPagerAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AnimeFragment()
            1 -> MangaFragment()
            else -> MangaFragment()
        }
    }
}