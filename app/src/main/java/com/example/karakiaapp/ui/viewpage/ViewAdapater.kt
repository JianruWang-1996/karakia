package com.example.karakiaapp.ui.viewpage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.karakiaapp.ui.karakia.KarakiaData

class ViewAdapater(activity: FragmentActivity,val exampleList: ArrayList<KarakiaData>): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment {
        return ViewFragment(position,exampleList)
    }
}