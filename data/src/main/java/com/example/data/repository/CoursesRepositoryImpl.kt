package com.example.data.repository

import com.example.domain.models.CoursesListItem
import com.example.domain.repository.CoursesRepository
import kotlinx.coroutines.flow.Flow

class CoursesRepositoryImpl : CoursesRepository {
    override fun getCoursesList(): Flow<List<CoursesListItem>> {
        TODO("Not yet implemented")
    }

    override fun getFavouritesCoursesList(): Flow<List<CoursesListItem>> {
        TODO("Not yet implemented")
    }
}