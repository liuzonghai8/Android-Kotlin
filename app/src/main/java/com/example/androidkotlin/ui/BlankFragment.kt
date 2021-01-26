package com.example.androidkotlin.ui

import android.view.View
import com.example.androidkotlin.R
import com.example.androidkotlin.base.BaseViewModelFragment
import com.example.androidkotlin.databinding.BlankFragmentBinding
import kotlinx.android.synthetic.main.blank_fragment.view.*


class BlankFragment : BaseViewModelFragment<BlankFragmentBinding,BlankViewModel>(){

    override fun initView(view: View) {
        super.initView(view)
        view.textView.text="广而告知"

    }

    override fun getLayoutResId(): Int = R.layout.blank_fragment
    override fun getSubVMClass(): Class<BlankViewModel> = BlankViewModel::class.java



}