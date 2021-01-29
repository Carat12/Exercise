package com.example.week14day5_gorest.models.network

import javax.inject.Inject

class UserRepository @Inject constructor(private val webService: WebService) {

    suspend fun getUsers() = webService.getUsers()
}