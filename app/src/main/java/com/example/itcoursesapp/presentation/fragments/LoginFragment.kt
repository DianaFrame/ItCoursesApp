package com.example.itcoursesapp.presentation.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.itcoursesapp.R
import com.example.itcoursesapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.buttonVk.setOnClickListener {
            openVk()
        }
        binding.buttonOk.setOnClickListener {
            openOk()
        }
        binding.buttonInput.setOnClickListener {
            navController.navigate(R.id.coursesListFragment)
        }

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) = LoginFragment()
    }

    private fun openVk() {
        val url = "https://vk.com/"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)

    }

    private fun openOk() {
        val url = "https://ok.ru/"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}