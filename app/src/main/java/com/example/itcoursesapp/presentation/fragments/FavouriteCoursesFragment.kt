package com.example.itcoursesapp.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.itcoursesapp.databinding.FragmentFavouriteCoursesBinding

class FavouriteCoursesFragment : Fragment() {

    private lateinit var binding: FragmentFavouriteCoursesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavouriteCoursesBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = FavouriteCoursesFragment()
    }
}