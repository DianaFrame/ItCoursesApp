package com.example.itcoursesapp.presentation.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.models.CoursesListItem
import com.example.itcoursesapp.databinding.CourseListItemBinding

class CoursesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = CourseListItemBinding.bind(view)
    fun bind(coursesListItem: CoursesListItem){

    }
}

