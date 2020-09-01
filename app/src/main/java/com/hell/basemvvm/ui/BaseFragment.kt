package com.hell.basemvvm.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hell.basemvvm.databinding.BaseBinding

class BaseFragment(private val viewModelFactory: ViewModelProvider.NewInstanceFactory) :
    Fragment() {

    private lateinit var binding: BaseBinding

    private val viewModel: BaseViewModel by lazy {
        ViewModelProvider(this, viewModelFactory).get(BaseViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BaseBinding.inflate(inflater, container, false)
        return binding.root
    }
}
