package com.example.domain.usecases

import com.example.domain.repository.CoursesRepository

class InsertCoursesIntoDbUseCase(private val repository: CoursesRepository) {
    suspend fun execute() {
        repository.insertCoursesListIntoDb()
    }
}