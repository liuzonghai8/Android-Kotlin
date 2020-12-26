package com.example.androidkotlin.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.example.androidkotlin.R
import com.example.androidkotlin.base.BaseViewFragment
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