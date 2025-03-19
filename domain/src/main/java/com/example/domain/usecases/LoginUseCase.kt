package com.example.domain.usecases

import com.example.domain.repository.CoursesRepository

class LoginUseCase(private val repository: CoursesRepository) {
    fun execute(login: String, password: String): Boolean {
        return repository.isSuccessLogin(login = login, password = password)
    }
}