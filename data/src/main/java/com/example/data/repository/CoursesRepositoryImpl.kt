package com.example.data.repository

import com.example.data.api.CoursesApi
import com.example.data.retrofit.Retrofit
import com.example.domain.models.CoursesListItem
import com.example.domain.repository.CoursesRepository
import kotlinx.coroutines.flow.Flow

class CoursesRepositoryImpl : CoursesRepository {
    private val api: CoursesApi by lazy { Retrofit.getClient().create(CoursesApi::class.java) }
    override suspend fun insertCoursesListIntoDb() {
        TODO("Not yet implemented")
    }

    override fun getCoursesList(): Flow<List<CoursesListItem>> {
        TODO("Not yet implemented")
    }

    override fun getFavouritesCoursesList(): Flow<List<CoursesListItem>> {
        TODO("Not yet implemented")
    }

    override fun getCoursesListSortedByPublishDate(): Flow<List<CoursesListItem>> {
        TODO("Not yet implemented")
    }

    override suspend fun insertFavouriteCourse(coursesListItem: CoursesListItem) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteFavouriteCourse(coursesListItem: CoursesListItem) {
        TODO("Not yet implemented")
    }
}