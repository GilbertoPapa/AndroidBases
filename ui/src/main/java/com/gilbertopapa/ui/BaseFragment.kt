package com.gilbertopapa.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding : ViewBinding> : Fragment() {
    private lateinit var _binding: Binding

    val binding: Binding get() = _binding

    abstract val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflater(inflater, container, false)
        return _binding.root
    }

//    protected fun getNavControllerFragment(fragment: Fragment) =
//        NavHostFragment.findNavController(fragment)
}