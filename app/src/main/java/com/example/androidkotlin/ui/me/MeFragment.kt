package com.example.androidkotlin.ui.me

import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.androidkotlin.R
import com.example.androidkotlin.base.BaseViewModelFragment
import com.example.androidkotlin.databinding.MeFragmentBinding
import kotlinx.android.synthetic.main.me_fragment.view.*

class MeFragment :BaseViewModelFragment<MeFragmentBinding,MeViewModel>() {

    override fun getLayoutResId(): Int=R.layout.me_fragment;
    override fun getSubVMClass(): Class<MeViewModel> {
       return MeViewModel::class.java
    }

    override fun initView(view: View) {
        super.initView(view)
        view.button.setOnClickListener{
            findNavController().navigate(R.id.action_meFragment_to_detailFragment)
        }
    }

}