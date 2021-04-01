package com.baish.internship.ui.bottomnavigation.home.build

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.baish.internship.databinding.AgrocultLayoutBinding
import com.baish.internship.databinding.BuildLayoutBinding

class BuildFragment : Fragment() {

    var binding : BuildLayoutBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =  BuildLayoutBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}