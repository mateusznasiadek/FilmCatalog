package com.example.catalogueapp.screens.details.detailsFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.catalogueapp.R
import com.example.catalogueapp.databinding.GalleryFragmentBinding
import com.example.catalogueapp.screens.details.DetailsViewModel

class GalleryFragment : Fragment() {

    private lateinit var binding: GalleryFragmentBinding
    private lateinit var viewModel: DetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.gallery_fragment, container, false)

        viewModel =
            ViewModelProvider(parentFragment as ViewModelStoreOwner).get(DetailsViewModel::class.java)

        binding.lifecycleOwner = viewLifecycleOwner

        val adapter = GalleryAdapter(viewModel.film.images)
        binding.galleryRV.adapter = adapter
        binding.galleryRV.layoutManager = LinearLayoutManager(this.context)

        return binding.root
    }

}