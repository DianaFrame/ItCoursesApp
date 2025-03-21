package com.example.data.repository

import com.example.data.api.CoursesApi
import com.example.data.db.MainDb
import com.example.data.models.Course
import com.example.data.retrofit.Retrofit
import com.example.domain.models.CoursesListItem
import com.example.domain.repository.CoursesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class CoursesRepositoryImpl(val mainDb: MainDb) : CoursesRepository {
    private val api: CoursesApi by lazy { Retrofit.getClient().create(CoursesApi::class.java) }
    override suspend fun insertCoursesListIntoDb() {
        api.getAllCourses().body()?.courses?.forEach { course ->
            mainDb.dao.insertCourse(course = course)
        }
    }

    override fun getCoursesList(): Flow<List<CoursesListItem>> {
        return mainDb.dao.getAllCoursesFromDb().map { it.toListCoursesList() }
    }

    override fun getFavouritesCoursesList(): Flow<List<CoursesListItem>> {
        return mainDb.dao.getFavouritesCourses().map { it.toListCoursesList() }
    }

    override fun getCoursesListSortedByPublishDate(): Flow<List<CoursesListItem>> {
        return mainDb.dao.getCoursesSortedByPublishDate().map { it.toListCoursesList() }
    }

    override suspend fun changeHasLikeByCourseList(coursesListItem: CoursesListItem) {
        mainDb.dao.insertCourse(coursesListItem.copy(hasLike = !coursesListItem.hasLike).toCourse())
    }


    private fun CoursesListItem.toCourse() : Course{
        return Course(
            hasLike = this.hasLike,
            id = this.id,
            price = this.price,
            publishDate = this.publishDate,
            rate = this.rate,
            startDate = this.startDate,
            text = this.text,
            title = this.title
        )
    }
    private fun Course.toCourseListItem(): CoursesListItem {
        return CoursesListItem(
            hasLike = this.hasLike,
            id = this.id,
            price = this.price,
            publishDate = this.publishDate,
            rate = this.rate,
            startDate = this.startDate,
            text = this.text,
            title = this.title
        )
    }

    private fun List<Course>.toListCoursesList(): List<CoursesListItem> {
        return this.map { it.toCourseListItem() }
    }
}