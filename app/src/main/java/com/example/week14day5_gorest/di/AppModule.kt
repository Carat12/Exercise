package com.example.week14day5_gorest.di

import com.example.week14day5_gorest.models.network.Constant
import com.example.week14day5_gorest.models.network.WebService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideWebService(retrofit: Retrofit) =
        retrofit.create(WebService::class.java)

    @Singleton
    @Provides
    fun provideRetrofit() = Retrofit.Builder()
        .baseUrl(Constant.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}