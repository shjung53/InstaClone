package com.example.instagramClone

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramClone.databinding.ItemStoryBinding

class StoryRVAdapter(): RecyclerView.Adapter<StoryRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): StoryRVAdapter.ViewHolder {
        val binding: ItemStoryBinding = ItemStoryBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StoryRVAdapter.ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = 4

    inner class ViewHolder(binding: ItemStoryBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){}
    }
}