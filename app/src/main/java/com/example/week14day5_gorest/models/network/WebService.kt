package com.example.week14day5_gorest.models.network

import com.example.week14day5_gorest.models.data.UserResponse
import retrofit2.http.GET

interface WebService {

    @GET(Constant.ENDPOINT)
    suspend fun getUsers(): UserResponse
}

object Constant{
    const val BASE_URL = "https://gorest.co.in/public-api/"
    const val ENDPOINT = "users"
}