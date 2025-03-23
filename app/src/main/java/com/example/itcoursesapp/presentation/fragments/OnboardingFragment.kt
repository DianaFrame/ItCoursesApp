package com.example.itcoursesapp.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.itcoursesapp.R
import com.example.itcoursesapp.databinding.FragmentOnboardingBinding


class OnboardingFragment : Fragment() {

    lateinit var binding: FragmentOnboardingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.horizontalScrollView.apply {
            post { scrollTo(250, 0) }
        }


    }

    companion object {

        @JvmStatic
        fun newInstance() = OnboardingFragment()
    }
}