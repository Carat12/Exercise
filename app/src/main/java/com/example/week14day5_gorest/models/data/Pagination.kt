package com.example.week14day5_gorest.models.data

data class Pagination(
    val limit: Int,
    val page: Int,
    val pages: Int,
    val total: Int
)