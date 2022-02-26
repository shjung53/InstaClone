package com.example.instagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramClone.databinding.ItemStoryBinding

class StoryRVAdapter(private var profileData: ArrayList<ProfileData>): RecyclerView.Adapter<StoryRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): StoryRVAdapter.ViewHolder {
        val binding: ItemStoryBinding = ItemStoryBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StoryRVAdapter.ViewHolder, position: Int) {
        holder.bind(profileData[position])
    }

    override fun getItemCount(): Int = profileData.size

    inner class ViewHolder(private val binding: ItemStoryBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(profileData: ProfileData){
            binding.itemStoryCiv.setImageResource(profileData.profileImg)
        }
    }
}