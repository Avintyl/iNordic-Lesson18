package com.example.lesson18.presentation

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.lesson18.R
import kotlinx.android.synthetic.main.fragment_web.*

class WebFragment : Fragment(R.layout.fragment_web) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val target = arguments?.getString("SEARCH_TARGET")

        wvSearchingResult.webViewClient = WebViewClient()
        wvSearchingResult.loadUrl("https://www.google.com/search?q=$target&tbm=isch")

    }

}