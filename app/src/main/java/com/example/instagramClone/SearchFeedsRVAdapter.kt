package com.example.instagramClone
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramClone.databinding.ItemFeedBinding

class SearchFeedsRVAdapter(var feedItem : ArrayList<FeedData>): RecyclerView.Adapter<SearchFeedsRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int
    ): SearchFeedsRVAdapter.ViewHolder {
        val binding: ItemFeedBinding = ItemFeedBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchFeedsRVAdapter.ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int = feedItem.size

    inner class ViewHolder(binding: ItemFeedBinding): RecyclerView.ViewHolder(binding.root){

    }
}