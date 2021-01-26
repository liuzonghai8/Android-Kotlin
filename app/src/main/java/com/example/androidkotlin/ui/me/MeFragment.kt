package com.example.androidkotlin.ui.me

import com.example.androidkotlin.R
import com.example.androidkotlin.base.BaseViewModelFragment
import com.example.androidkotlin.databinding.MeFragmentBinding

class MeFragment :BaseViewModelFragment<MeFragmentBinding,MeViewModel>() {

    override fun getLayoutResId(): Int=R.layout.me_fragment;
    override fun getSubVMClass(): Class<MeViewModel> {
       return MeViewModel::class.java
    }


}