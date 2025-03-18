package com.example.domain.models

data class CoursesListItem(
    val hasLike: Boolean,
    val id: Int,
    val price: String,
    val publishDate: String,
    val rate: String,
    val startDate: String,
    val text: String,
    val title: String
)
