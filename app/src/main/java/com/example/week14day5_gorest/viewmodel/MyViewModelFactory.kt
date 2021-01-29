package com.example.week14day5_gorest.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

class MyViewModelFactory @Inject constructor(
    private val creators: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return creators[modelClass]?.get() as T
        //Log.d("woozi", "type: $modelClass; ${UserViewModel::class}")
        /*if (modelClass == UserViewModel::class)
            return UserViewModel(repository) as T
        else
            throw IllegalArgumentException("Please use valid viewModel")*/
    }
}