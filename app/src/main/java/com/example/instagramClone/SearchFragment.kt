package com.example.instagramClone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instagramClone.databinding.FragmentSearchBinding

class SearchFragment: Fragment() {
    lateinit var binding: FragmentSearchBinding
    private val feedItem  = ArrayList<FeedData>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(inflater, container, false)

        val searchFeedRVAdapter = SearchFeedsRVAdapter(feedItem)
        binding.searchGridRv.adapter = searchFeedRVAdapter

        val gridLayoutManager = GridLayoutManager(requireContext(),3)
        binding.searchGridRv.layoutManager = gridLayoutManager

        feedItem.apply {

            add(FeedData(R.drawable.picture1))
            add(FeedData(R.drawable.picture2))
            add(FeedData(R.drawable.picture3))
            add(FeedData(R.drawable.picture4))
            add(FeedData(R.drawable.picture5))
        }



        searchFeedRVAdapter.notifyItemInserted(feedItem.size)

        return binding.root
    }
}