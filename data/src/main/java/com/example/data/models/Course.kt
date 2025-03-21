package com.example.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Courses")
data class Course(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "hasLike")
    val hasLike: Boolean,
    @ColumnInfo(name = "price")
    val price: String,
    @ColumnInfo(name = "publishDate")
    val publishDate: String,
    @ColumnInfo(name = "rate")
    val rate: String,
    @ColumnInfo(name = "startDate")
    val startDate: String,
    @ColumnInfo(name = "text")
    val text: String,
    @ColumnInfo(name = "title")
    val title: String
)