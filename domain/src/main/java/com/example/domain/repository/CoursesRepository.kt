package com.example.domain.repository

import com.example.domain.models.CoursesListItem
import kotlinx.coroutines.flow.Flow


interface CoursesRepository {

    fun isSuccessLogin(
        login: String,
        password: String
    ): Boolean {
        val loginPattern = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")
        return loginPattern.matches(login) && password.trim() != ""
    }

    suspend fun insertCoursesListIntoDb()

    fun getCoursesList(): Flow<List<CoursesListItem>>

    fun getFavouritesCoursesList(): Flow<List<CoursesListItem>>

    fun getCoursesListSortedByPublishDate(): Flow<List<CoursesListItem>>

    suspend fun changeHasLikeByCourseList(coursesListItem: CoursesListItem)


}