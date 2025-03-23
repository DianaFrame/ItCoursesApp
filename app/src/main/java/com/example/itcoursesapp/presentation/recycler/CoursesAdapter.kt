package com.example.itcoursesapp.presentation.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.domain.models.CoursesListItem
import com.example.itcoursesapp.R

class CoursesAdapter : ListAdapter<CoursesListItem, CoursesViewHolder>(Comparator()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.course_list_item, parent, false)
        return CoursesViewHolder(view = view)
    }

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        return holder.bind(
            coursesListItem = getItem(position)
        )
    }
}

