package com.example.lesson18.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.lesson18.R

fun FragmentManager.navigateToFragment(fragment: Fragment) {
    this.beginTransaction()
        .replace(R.id.fragmentContainer, fragment)
        .addToBackStack(null)
        .commit()
}