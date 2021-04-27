package com.gilbertopapa.view

import android.app.Activity
import android.content.Context
import android.content.Intent

fun Context.initActivity(
    context: Context,
    activity: Activity,
    flagActivity: Int = Intent.FLAG_ACTIVITY_NEW_TASK
) {
    val intent = Intent(context, activity::class.java)
    intent.flags = flagActivity
    startActivity(intent)
}