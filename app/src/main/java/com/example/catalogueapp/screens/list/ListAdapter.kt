package com.example.catalogueapp.screens.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import com.example.catalogueapp.R
import com.example.catalogueapp.films.*
import com.example.catalogueapp.screens.details.DetailsViewModel
import kotlinx.android.synthetic.main.list_item.view.*

class ListAdapter(
    private var films: ArrayList<Film>,
    private val listener: (Film) -> Unit
) : RecyclerView.Adapter<ListAdapter.FilmAdapter>() {
    inner class FilmAdapter(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return FilmAdapter(view)
    }

    override fun onBindViewHolder(holder: FilmAdapter, position: Int) {
        holder.itemView.apply {
            catTV.text = films[position].category
            titleTV.text = films[position].title
            setTextColor(holder, position)
            posterIV.setImageDrawable(ContextCompat.getDrawable(context, films[position].poster))
            if (films[position].isFavourite)
                favBTN.setImageDrawable(
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.full_heart_icon
                    )
                )
        }

        holder.itemView.favBTN.setOnClickListener {
            val isFav = !films[position].isFavourite
            films[position].isFavourite = isFav
            if (isFav)
                holder.itemView.favBTN.setImageResource(R.drawable.full_heart_icon)
            else
                holder.itemView.favBTN.setImageResource(R.drawable.empty_heart_icon)
        }

        holder.itemView.setOnClickListener { listener(films[position]) }
    }

    override fun getItemCount(): Int {
        return films.size
    }

    private fun setTextColor(holder: FilmAdapter, position: Int) {
        val cat = films[position].category
        val color: Int
        color = when (cat) {
            CATEGORY_DRAMA -> holder.itemView.resources.getColor(R.color.dramaColor)
            CATEGORY_FANTASY -> holder.itemView.resources.getColor(R.color.fantasyColor)
            CATEGORY_COMEDY_DRAMA -> holder.itemView.resources.getColor(R.color.comedyDramaColor)
            CATEGORY_MELODRAMA -> holder.itemView.resources.getColor(R.color.melodramaColor)
            else -> holder.itemView.resources.getColor(R.color.black)
        }
        holder.itemView.apply {
            titleTV.setTextColor(color)
        }
    }

    fun deleteItem(position: Int) {
        films.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, itemCount)
    }
}