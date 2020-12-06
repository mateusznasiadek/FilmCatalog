package com.example.catalogueapp.films

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//categories
const val CATEGORY_DRAMA = "dramat"
const val CATEGORY_FANTASY = "fantasy"
const val CATEGORY_MELODRAMA = "melodramat"
const val CATEGORY_COMEDY_DRAMA = "komediodramat"

@Parcelize
data class Film(
    val title: String,
    val date: String,
    val length: String,
    val desc: String,
    val cast: ArrayList<String>?,
    val category: String,
    val poster: Int,
    val images: ArrayList<Int>,
    var isFavourite: Boolean = false,
) : Parcelable
