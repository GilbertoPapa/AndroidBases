package com.gilbertopapa.ui

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment

fun getNavControllerFragment(fragment: Fragment) =
    NavHostFragment.findNavController(fragment)
