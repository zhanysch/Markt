package com.baish.internship.ui.bottomnavigation.details

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.baish.internship.R
import com.baish.internship.databinding.DetailsLayoutBinding


class DetailsFragment: Fragment() {

    var binding : DetailsLayoutBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding =  DetailsLayoutBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = DetailsFragmentArgs.fromBundle(requireArguments())

        binding?.textCity?.text = bundle.details?.city?.let { binding?.root?.context?.getString(it) }
        binding?.textPrice?.text = bundle.details?.priceD?.let { binding?.root?.context?.getString(it) }
        binding?.description?.text = bundle.details?.description?.let { binding?.root?.context?.getString(it) }
        binding?.textSale?.text =  bundle.details?.title?.let { binding?.root?.context?.getString(it) }

        binding?.watched?.text = bundle.details?.checked?.let { binding?.root?.context?.getString(it) }
        binding?.dateNumber?.text = bundle.details?.date?.let { binding?.root?.context?.getString(it) }


        if (bundle.details?.image !=null)
         binding?.imageDetails?.setImageResource(bundle.details.image)



        binding?.imageBack?.setOnClickListener {
           findNavController().popBackStack()
        }
    }



}