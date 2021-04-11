package com.gilbertopapa.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseViewBindingActivity<Binding : ViewBinding> : AppCompatActivity() {
    protected abstract val inflate: (LayoutInflater) -> Binding

    private val binding: Binding by lazy {
        inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}