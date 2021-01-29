package com.example.week14day5_gorest.di

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.week14day5_gorest.viewmodel.UserViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(value = UserViewModel::class)
    abstract fun bindViewModel(viewModel: UserViewModel): ViewModel
}

@MapKey
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class ViewModelKey(val value: KClass<out ViewModel>)