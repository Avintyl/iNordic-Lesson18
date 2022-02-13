package com.example.lesson18.utils

import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

fun Fragment.loadImageFromNetworkWithGlide(imageUrl: String, imageView: ImageView) {
    Glide.with(this.requireContext())
        .load(imageUrl)
        .into(imageView)
}