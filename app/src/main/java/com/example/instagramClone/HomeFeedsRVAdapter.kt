package com.example.instagramClone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramClone.databinding.ItemFeedBinding

class HomeFeedsRVAdapter(private val feedsItem: ArrayList<FeedData>): RecyclerView.Adapter<HomeFeedsRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): HomeFeedsRVAdapter.ViewHolder {
        val binding: ItemFeedBinding = ItemFeedBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeFeedsRVAdapter.ViewHolder, position: Int) {
        holder.bind(feedsItem[position])
    }

    override fun getItemCount(): Int = feedsItem.size


    inner class ViewHolder(private val binding: ItemFeedBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(feedData: FeedData){
            binding.itemFeedImageIv.setImageResource(feedData.feedImg)
        }
    }

}