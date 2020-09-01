package com.hell.basemvvm.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class BaseViewModel(application: Application) : ViewModel() {


    @Suppress("UNCHECKED_CAST")
    class BaseViewModelFactory(private val application: Application) :
        ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return BaseViewModel(application) as T
        }
    }
}
