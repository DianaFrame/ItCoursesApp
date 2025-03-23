package com.example.itcoursesapp.presentation.recycler

import androidx.recyclerview.widget.DiffUtil
import com.example.domain.models.CoursesListItem

class Comparator : DiffUtil.ItemCallback<CoursesListItem>() {
    override fun areItemsTheSame(oldItem: CoursesListItem, newItem: CoursesListItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: CoursesListItem, newItem: CoursesListItem): Boolean {
        return oldItem == newItem
    }

}
