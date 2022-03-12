package com.example.instagramClone
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramClone.databinding.ItemFeedBinding
import com.example.instagramClone.databinding.ItemSearchFeedBinding

class SearchFeedsRVAdapter(var feedsItem: ArrayList<FeedData>): RecyclerView.Adapter<SearchFeedsRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int
    ): SearchFeedsRVAdapter.ViewHolder {
        val binding: ItemSearchFeedBinding = ItemSearchFeedBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchFeedsRVAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = feedsItem.size

    inner class ViewHolder(private val binding: ItemSearchFeedBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(feedData: FeedData){
            binding.itemSearchFeedIv.setImageResource(feedData.feedImg)
        }
    }
}