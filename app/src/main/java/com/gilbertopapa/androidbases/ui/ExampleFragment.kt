package com.gilbertopapa.androidbases.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gilbertopapa.androidbases.R
import com.gilbertopapa.androidbases.databinding.FragmentTestBinding
import com.gilbertopapa.ui.BaseFragment
import com.gilbertopapa.ui.getNavControllerFragment

class ExampleFragment : BaseFragment<FragmentTestBinding>() {
    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentTestBinding
        get() = FragmentTestBinding::inflate


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButton()
    }

    private fun setupButton(){
        binding.next.setOnClickListener {
            getNavControllerFragment(this).navigate(R.id.action_exampleFragment_to_exampleTwoFragment)
        }
    }
}