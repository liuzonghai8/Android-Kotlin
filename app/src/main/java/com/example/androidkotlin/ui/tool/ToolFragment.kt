package com.example.androidkotlin.ui.tool

import android.view.View
import com.example.androidkotlin.R
import com.example.androidkotlin.base.BaseViewModelFragment
import com.example.androidkotlin.databinding.ToolFragmentBinding
import kotlinx.android.synthetic.main.tool_fragment.view.*

class ToolFragment : BaseViewModelFragment<ToolFragmentBinding,ToolViewModel>() {


    override fun initView(view: View) {
        super.initView(view)
        view.textView2.text="tool"
    }

    override fun getLayoutResId(): Int {
        return R.layout.tool_fragment}

    override fun getSubVMClass(): Class<ToolViewModel> {
        return ToolViewModel::class.java
    }


}