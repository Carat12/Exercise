package com.example.week14day5_gorest.di

import com.example.week14day5_gorest.views.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ViewModelFactoryModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}