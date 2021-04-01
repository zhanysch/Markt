package com.baish.internship.ui.bottomnavigation.home.agro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.baish.internship.R
import com.baish.internship.databinding.AgromarktLayoutBinding
import com.baish.internship.databinding.HomeLayoutBinding
import com.baish.internship.ui.bottomnavigation.home.HomeFragmentDirections
import com.baish.internship.utils.IntFaceClickRecycler
import org.koin.androidx.viewmodel.ext.android.viewModel

class AgroMarktFragment: Fragment(), IntFaceClickRecycler {

    var binding : AgromarktLayoutBinding? = null

    private val vm by viewModel<AgroMarkViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =  AgromarktLayoutBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hereWeGo()


    }

    private fun hereWeGo() {
        val adapter = AgroAdapter(this)
        binding?.RecyclerView?.adapter = adapter
        vm.data.observe(viewLifecycleOwner, Observer {
            adapter.update(it)
        })
    }

    override fun gotoTheDetails(data: Dataclass) {
        val dest = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(data)
        findNavController().navigate(dest)
    }
}