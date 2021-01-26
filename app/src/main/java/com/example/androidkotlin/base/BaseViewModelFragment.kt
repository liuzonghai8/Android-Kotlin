package com.example.androidkotlin.base

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseViewModelFragment<T: ViewDataBinding,VM: ViewModel>:BaseViewFragment<T>() {
//    private val model: SharedViewModel by activityViewModels()
//   private val viewModel by viewModels<vm>()

    private lateinit var model:VM
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       initViewModel()

    }

    private fun initViewModel(){
        model=ViewModelProvider(this).get(getSubVMClass())
    }

    abstract fun getSubVMClass(): Class<VM>
}