package com.example.domain.usecases

import com.example.domain.models.CoursesListItem
import com.example.domain.repository.CoursesRepository

class InsertFavouriteCourseUseCase(private val repository: CoursesRepository) {
    suspend fun execute(coursesListItem: CoursesListItem) {
        repository.insertFavouriteCourse(coursesListItem = coursesListItem)
    }
}