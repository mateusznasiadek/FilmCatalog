package com.example.catalogueapp.screens.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.catalogueapp.R
import com.example.catalogueapp.databinding.DetailsViewPagerFragmentBinding
import com.example.catalogueapp.screens.details.detailsFragments.DescriptionFragment
import com.example.catalogueapp.screens.details.detailsFragments.ActorsFragment
import com.example.catalogueapp.screens.details.detailsFragments.GalleryFragment

class DetailsFragment : Fragment() {

    private lateinit var binding: DetailsViewPagerFragmentBinding
    private lateinit var viewModel: DetailsViewModel
    private lateinit var viewModelFactory: DetailsViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.details_view_pager_fragment,
            container,
            false
        )

        viewModelFactory =
            DetailsViewModelFactory(DetailsFragmentArgs.fromBundle(requireArguments()).film)
        viewModel = ViewModelProvider(this, viewModelFactory).get(DetailsViewModel::class.java)


        val fragmentList = arrayListOf<Fragment>(
            DescriptionFragment(),
            GalleryFragment(),
            ActorsFragment()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            this
        )

        binding.viewPager.adapter = adapter

        return binding.root
    }
}