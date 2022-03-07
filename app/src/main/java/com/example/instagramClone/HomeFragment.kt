package com.example.instagramClone
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.instagramClone.databinding.FragmentHomeBinding
import com.rd.PageIndicatorView

class HomeFragment: Fragment() {
    lateinit var binding: FragmentHomeBinding
    var profileImg = ArrayList<ProfileData>()
    var feedItem = ArrayList<FeedData>()
    lateinit var feedImgVPAdapter : FeedImgVPAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)


//        스토리 어댑터
        val storyAdapter = StoryRVAdapter(profileImg)
        binding.homeStoryRv.adapter = storyAdapter
        binding.homeStoryRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        profileImg.apply {
            add(ProfileData(R.drawable.picture1))
            add(ProfileData(R.drawable.picture2))
            add(ProfileData(R.drawable.picture3))
            add(ProfileData(R.drawable.picture4))
            add(ProfileData(R.drawable.picture5))
        }
        storyAdapter.notifyItemInserted(profileImg.size)

//        피드 어댑터
        val feedAdapter = HomeFeedsRVAdapter(feedItem)
        binding.homeFeedsRv.adapter = feedAdapter
        binding.homeFeedsRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        feedItem.apply {
            add(FeedData(R.drawable.picture1))
            add(FeedData(R.drawable.picture2))
            add(FeedData(R.drawable.picture3))
            add(FeedData(R.drawable.picture4))
            add(FeedData(R.drawable.picture5))
        }
        feedAdapter.notifyItemInserted(feedItem.size)

        feedAdapter.setMyItemClickListener(object: HomeFeedsRVAdapter.MyItemClickListener{
            override fun setVp(holder: HomeFeedsRVAdapter.ViewHolder) {
                feedImgVPAdapter = FeedImgVPAdapter(requireActivity())

                holder.binding.itemFeedImageVp.adapter = feedImgVPAdapter
                holder.binding.itemFeedImageVp.orientation = ViewPager2.ORIENTATION_HORIZONTAL

                for(i in 1 .. feedItem.size){
                    feedImgVPAdapter.addFragment(FeedImgVPFragment(feedItem[i-1]))}

                feedImgVPAdapter.notifyItemInserted(feedItem.size)

                val vpIndicatorView: PageIndicatorView = holder.binding.itemFeedPageIndicatorPiv
                vpIndicatorView.count = feedImgVPAdapter.itemCount

            }

        })










        return binding.root
    }
}