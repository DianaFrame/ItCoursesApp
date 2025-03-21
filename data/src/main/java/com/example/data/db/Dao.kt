package com.example.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.models.Course
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCourse(course: Course)

    @Query("SELECT * FROM Courses")
    fun getAllCoursesFromDb(): Flow<List<Course>>

    @Query("SELECT * FROM Courses WHERE hasLike = 1")
    fun getFavouritesCourses(): Flow<List<Course>>

    @Query("SELECT * FROM Courses ORDER BY publishDate")
    fun getCoursesSortedByPublishDate() : Flow<List<Course>>

}