package com.baish.internship.ui.bottomnavigation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.baish.internship.R
import com.baish.internship.databinding.HomeLayoutBinding
import com.baish.internship.ui.bottomnavigation.home.agro.AgroMarktFragment
import com.baish.internship.ui.bottomnavigation.home.agrocult.AgroCultFragment
import com.baish.internship.ui.bottomnavigation.home.build.BuildFragment

class HomeFragment : Fragment() {

    var binding : HomeLayoutBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = HomeLayoutBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        val adapter = PagerAdapter(childFragmentManager)
        binding?.viewPager?.adapter = adapter
        adapter.addFragment(AgroMarktFragment(),"Агробазар")
        adapter.addFragment(AgroCultFragment(),"Сельхоз \n Техника")
        adapter.addFragment(BuildFragment(),"строительные\n материалы")
        binding?.tabLayout?.setupWithViewPager(binding?.viewPager)








































        binding?.tabLayout?.getTabAt(0)?.setIcon(R.drawable.ic_cow)
        binding?.tabLayout?.getTabAt(1)?.setIcon(R.drawable.ic_trackt)
        binding?.tabLayout?.getTabAt(2)?.setIcon(R.drawable.ic_stroit)
    }
}