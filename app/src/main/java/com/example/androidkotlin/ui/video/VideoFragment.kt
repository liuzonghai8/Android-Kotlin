package com.example.androidkotlin.ui.video

import android.view.View
import com.example.androidkotlin.R
import com.example.androidkotlin.base.BaseViewModelFragment
import com.example.androidkotlin.databinding.VideoFragmentBinding
import kotlinx.android.synthetic.main.video_fragment.view.*

class VideoFragment : BaseViewModelFragment<VideoFragmentBinding,VideoViewModel>() {

    override fun getSubVMClass(): Class<VideoViewModel> = VideoViewModel::class.java

    override fun getLayoutResId(): Int = R.layout.video_fragment

    override fun initView(view: View) {
        super.initView(view)
        view.video.text="video"
    }

}