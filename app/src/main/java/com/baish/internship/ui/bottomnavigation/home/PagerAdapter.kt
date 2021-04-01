package com.baish.internship.ui.bottomnavigation.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PagerAdapter(f : FragmentManager): FragmentStatePagerAdapter(f) {

    private var list = arrayListOf<Fragment>()
    private var titles = arrayListOf<String>()

    fun addFragment(fragmen: Fragment,title :String){
        list.add(fragmen)
        titles.add(title)
        notifyDataSetChanged()
    }

    override fun getPageTitle(position: Int)= titles[position]

    override fun getItem(position: Int)=list[position]
    override fun getCount()=  list.size


}