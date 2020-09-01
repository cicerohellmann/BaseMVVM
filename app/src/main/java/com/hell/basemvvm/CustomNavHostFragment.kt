package com.hell.basemvvm

import android.app.Application
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

class CustomNavHostFragment : NavHostFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val application = requireContext().applicationContext as Application
        childFragmentManager.fragmentFactory = CustomFragmentFactory(application)
        super.onCreate(savedInstanceState)
    }
}