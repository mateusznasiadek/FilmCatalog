package com.example.catalogueapp.screens.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.catalogueapp.films.Film

class DetailsViewModelFactory(private val film: Film) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailsViewModel::class.java)) {
            return DetailsViewModel(film) as T
        } else throw IllegalArgumentException("Unknown ViewModel class")
    }
}