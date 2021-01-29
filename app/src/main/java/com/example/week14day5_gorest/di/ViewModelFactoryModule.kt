package com.example.week14day5_gorest.di

import androidx.lifecycle.ViewModelProvider
import com.example.week14day5_gorest.viewmodel.MyViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(factory: MyViewModelFactory): ViewModelProvider.Factory
}