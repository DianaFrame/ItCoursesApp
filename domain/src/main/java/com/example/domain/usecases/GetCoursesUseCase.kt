package com.example.domain.usecases

import com.example.domain.models.CoursesListItem
import com.example.domain.repository.CoursesRepository
import kotlinx.coroutines.flow.Flow

class GetCoursesUseCase(private val repository: CoursesRepository) {
    fun execute(): Flow<List<CoursesListItem>> {
        return repository.getCoursesList()
    }
}