package com.example.data.api

import com.example.data.models.Courses
import retrofit2.Response
import retrofit2.http.GET

interface CoursesApi {

    @GET("courses.json")
    fun getAllCourses(): Response<Courses>

}