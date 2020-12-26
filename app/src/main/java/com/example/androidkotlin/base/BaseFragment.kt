package com.example.androidkotlin.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val rootView= inflater.inflate(getLayoutResId(), container, false)

        initView(rootView);
//        super.onCreateView(inflater, container, savedInstanceState)

        return rootView;
    }

    abstract fun getLayoutResId(): Int

    open fun initView(view:View){}


}