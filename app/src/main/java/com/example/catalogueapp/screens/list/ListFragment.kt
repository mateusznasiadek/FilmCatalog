package com.example.catalogueapp.screens.list

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.catalogueapp.R
import com.example.catalogueapp.databinding.ListFragmentBinding
import com.example.catalogueapp.films.*

class ListFragment : Fragment() {

    private lateinit var binding: ListFragmentBinding
    private lateinit var viewModel: ListViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.list_fragment, container, false)

        viewModel = ViewModelProvider(this).get(ListViewModel::class.java)

        //recycler view adapter
        viewModel.films.value?.let { setUpRecyclerView(it) }

        setHasOptionsMenu(true);

        return binding.root
    }

    private fun setUpRecyclerView(films: ArrayList<Film>) {
        val adapter = ListAdapter(films) { film -> goToDetails(film) }
        binding.listRV.adapter = adapter
        binding.listRV.layoutManager = LinearLayoutManager(this.context)

        val itemHelper = ItemTouchHelper(SwipeToDeleteCallback(adapter))
        itemHelper.attachToRecyclerView(binding.listRV)
    }

    private fun goToDetails(film: Film) {
        val action = ListFragmentDirections.actionListToDetails(film)
        NavHostFragment.findNavController(this).navigate(action)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        viewModel.films.value = viewModel.filmsBackup.value

        return when (item.itemId) {
            R.id.drama_filter -> {
                viewModel.setBackup()
                viewModel.films.value = filterListByCat(CATEGORY_DRAMA)
                setUpRecyclerView(viewModel.films.value!!)
                true
            }
            R.id.fantasy_filter -> {
                viewModel.setBackup()
                viewModel.films.value = filterListByCat(CATEGORY_FANTASY)
                setUpRecyclerView(viewModel.films.value!!)
                true
            }
            R.id.melodrama_filter -> {
                viewModel.setBackup()
                viewModel.films.value = filterListByCat(CATEGORY_MELODRAMA)
                setUpRecyclerView(viewModel.films.value!!)
                true
            }
            R.id.comedydrama_filter -> {
                viewModel.setBackup()
                viewModel.films.value = filterListByCat(CATEGORY_COMEDY_DRAMA)
                setUpRecyclerView(viewModel.films.value!!)
                true
            }
            R.id.favourite_filter -> {
                viewModel.setBackup()
                viewModel.films.value = filterListByFav()
                setUpRecyclerView(viewModel.films.value!!)
                true
            }
            R.id.no_filter -> {
                setUpRecyclerView(viewModel.films.value!!)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun filterListByCat(category: String): ArrayList<Film> {
        val filteredFilms: ArrayList<Film> = ArrayList()

        for (film in viewModel.films.value!!) {
            if (film.category == category) {
                filteredFilms.add(film)
            }
        }
        return filteredFilms
    }

    private fun filterListByFav(): ArrayList<Film> {
        val filteredFilms: ArrayList<Film> = ArrayList()

        for (film in viewModel.films.value!!) {
            if (film.isFavourite) {
                filteredFilms.add(film)
            }
        }
        return filteredFilms
    }
}

