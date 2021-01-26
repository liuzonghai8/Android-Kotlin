package com.example.androidkotlin.ui.docs

import android.view.View
import com.example.androidkotlin.R
import com.example.androidkotlin.base.BaseViewModelFragment
import com.example.androidkotlin.databinding.DocsFragmentBinding
import kotlinx.android.synthetic.main.docs_fragment.view.*

class DocsFragment :BaseViewModelFragment<DocsFragmentBinding,DocsViewModel>() {


    override fun initView(view: View) {
        super.initView(view)
        view.text_test.text="docs"
    }
    override fun getSubVMClass(): Class<DocsViewModel> =DocsViewModel::class.java

    override fun getLayoutResId(): Int = R.layout.docs_fragment

}