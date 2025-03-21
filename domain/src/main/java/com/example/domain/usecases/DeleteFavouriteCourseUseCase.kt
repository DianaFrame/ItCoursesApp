package com.example.domain.usecases

import com.example.domain.models.CoursesListItem
import com.example.domain.repository.CoursesRepository

class DeleteFavouriteCourseUseCase(private val repository: CoursesRepository) {
    suspend fun execute(coursesListItem: CoursesListItem){
        repository.deleteFavouriteCourse(coursesListItem = coursesListItem)
    }
}