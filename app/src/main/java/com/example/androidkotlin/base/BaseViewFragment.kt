package com.example.androidkotlin.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract  class BaseViewFragment<T : ViewDataBinding>:Fragment(){

    protected lateinit  var binding:T

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,getLayoutResId(),container,false)
        val view:View = binding.root
        initView(view)
        return view
    }

    /**
     * update UI
     *
     */
    open fun initView(view: View){}

    abstract fun getLayoutResId(): Int
}