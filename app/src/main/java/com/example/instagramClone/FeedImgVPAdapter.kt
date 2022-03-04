package com.example.instagramClone

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FeedImgVPAdapter (fragment: FragmentActivity) : FragmentStateAdapter(fragment){

    private val postList: ArrayList<Fragment> = ArrayList()

    override fun getItemCount(): Int = postList.size

    override fun createFragment(position: Int): Fragment = postList[position]

    fun addFragment (fragment: Fragment) {
        postList.add(fragment)
        notifyItemInserted(postList.size - 1)
    }

}