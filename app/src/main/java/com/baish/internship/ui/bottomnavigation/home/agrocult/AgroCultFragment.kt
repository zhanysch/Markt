package com.baish.internship.ui.bottomnavigation.home.agrocult

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.baish.internship.databinding.AgrocultLayoutBinding
import com.baish.internship.databinding.AgromarktLayoutBinding

class AgroCultFragment : Fragment() {

    var binding : AgrocultLayoutBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =  AgrocultLayoutBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}