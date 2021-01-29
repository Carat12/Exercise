package com.example.week14day5_gorest.models.data

data class UserResponse(
    val code: Int,
    val data: ArrayList<User>,
    val meta: Meta
)