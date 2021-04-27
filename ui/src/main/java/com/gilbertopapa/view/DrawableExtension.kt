package com.gilbertopapa.view

import android.content.Context
import androidx.core.content.ContextCompat

fun Context.getDrawableResource(resId : Int , context: Context) = ContextCompat.getDrawable(context,resId)