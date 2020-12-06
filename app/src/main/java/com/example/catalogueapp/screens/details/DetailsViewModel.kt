package com.example.catalogueapp.screens.details

import androidx.lifecycle.ViewModel
import com.example.catalogueapp.films.Film

class DetailsViewModel(film: Film) : ViewModel() {

    //chosen film
    private var _film :Film = film
    val film:Film
        get() = _film

    fun getCastToString(): String {
        var cast = ""
        for (i in _film.cast!!)
            cast += " - $i\n"
        return cast
    }
}