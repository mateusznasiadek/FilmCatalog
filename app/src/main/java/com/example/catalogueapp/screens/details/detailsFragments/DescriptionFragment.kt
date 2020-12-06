package com.example.catalogueapp.screens.details.detailsFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import com.example.catalogueapp.R
import com.example.catalogueapp.databinding.DescriptionFragmentBinding
import com.example.catalogueapp.screens.details.DetailsViewModel
import com.example.catalogueapp.screens.details.DetailsViewModelFactory


class DescriptionFragment : Fragment() {

    private lateinit var binding: DescriptionFragmentBinding
    private lateinit var viewModel: DetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.description_fragment, container, false)

        viewModel =
            ViewModelProvider(parentFragment as ViewModelStoreOwner).get(DetailsViewModel::class.java)

        binding.detailsViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}