package com.example.domain.usecases

import com.example.domain.models.CoursesListItem
import com.example.domain.repository.CoursesRepository
import kotlinx.coroutines.flow.Flow

class GetCoursesSortedByPublishDateUseCase(private val repository: CoursesRepository) {
    fun execute(): Flow<List<CoursesListItem>> {
        return repository.getCoursesListSortedByPublishDate()
    }
}