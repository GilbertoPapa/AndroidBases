package com.gilbertopapa.androidbases.ui

import android.view.LayoutInflater
import com.gilbertopapa.androidbases.databinding.ActivityMainBinding
import com.gilbertopapa.androidbases.databinding.ApplicationBinding
import com.gilbertopapa.ui.BaseActivity

class Application : BaseActivity<ApplicationBinding>() {
    override val inflate: (LayoutInflater) -> ApplicationBinding
        get() = ApplicationBinding::inflate

}