package com.gilbertopapa.androidbases.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.gilbertopapa.androidbases.databinding.FragmentTestBinding
import com.gilbertopapa.androidbases.databinding.FragmentTestTwoBinding
import com.gilbertopapa.ui.BaseFragment

class ExampleTwoFragment : BaseFragment<FragmentTestTwoBinding>() {
    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentTestTwoBinding
        get() = FragmentTestTwoBinding::inflate

}