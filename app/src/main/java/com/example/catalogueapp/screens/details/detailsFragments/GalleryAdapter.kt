package com.example.catalogueapp.screens.details.detailsFragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.catalogueapp.R
import kotlinx.android.synthetic.main.gallery_item.view.*

class GalleryAdapter(
    private val photos: ArrayList<Int>
) : RecyclerView.Adapter<GalleryAdapter.PhotoAdapter>() {
    inner class PhotoAdapter(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoAdapter {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.gallery_item, parent, false)
        return PhotoAdapter(view)
    }

    override fun onBindViewHolder(holder: PhotoAdapter, position: Int) {
        holder.itemView.apply {
            filmPhotoIV.setImageDrawable(ContextCompat.getDrawable(context, photos[position]))
        }
    }

    override fun getItemCount(): Int {
        return photos.size
    }
}