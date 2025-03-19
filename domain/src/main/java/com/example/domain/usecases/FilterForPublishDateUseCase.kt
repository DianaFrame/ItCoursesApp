package com.example.domain.usecases

import com.example.domain.models.CoursesListItem
import com.example.domain.repository.CoursesRepository

class FilterForPublishDateUseCase(private val repository: CoursesRepository) {
    fun execute(courses: List<CoursesListItem>): List<CoursesListItem> {
        return repository.filterForPublishDate(coursesList = courses)
    }
}