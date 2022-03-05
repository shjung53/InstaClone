package com.example.instagramClone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.instagramClone.databinding.FragmentFeedImgBinding

class FeedImgVPFragment(private var feedData: FeedData): Fragment() {
    lateinit var binding: FragmentFeedImgBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFeedImgBinding.inflate(inflater, container, false)

        binding.feedImgIv.setImageResource(feedData.feedImg)
        return binding.root
    }


}