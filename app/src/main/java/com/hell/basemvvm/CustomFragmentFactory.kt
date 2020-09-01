package com.hell.basemvvm

import android.app.Application
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.hell.basemvvm.ui.BaseFragment
import com.hell.basemvvm.ui.BaseViewModel

class CustomFragmentFactory(private val application: Application) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {

        return when (className) {
            BaseFragment::class.java.name -> {
                BaseFragment(
                    BaseViewModel.BaseViewModelFactory(application)
                )
            }

            else -> super.instantiate(classLoader, className)
        }

    }
}