package com.base.newmovie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.base.newmovie.adapter.MoviesListAdapter
import com.base.newmovie.data.State
import com.base.newmovie.viewmodel.MoviesListViewModel
import kotlinx.android.synthetic.main.fragment_movi.*


class MoviFragment : Fragment (R.layout.fragment_movi) {
    private lateinit var viewModel: MoviesListViewModel
    private lateinit var newsListAdapter: MoviesListAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(MoviesListViewModel::class.java)
        initAdapter()
        initState()
    }

    private fun initAdapter() {
        newsListAdapter = MoviesListAdapter { viewModel.retry() }
        rv_listmovie.adapter = newsListAdapter
        viewModel.moviesList.observe(this.viewLifecycleOwner,
            Observer {
                newsListAdapter.submitList(it)
            })
    }

    private fun initState() {
        txt_error.setOnClickListener { viewModel.retry() }
        viewModel.getState().observe(this.viewLifecycleOwner, Observer { state ->
            progress_bar.visibility =
                if (viewModel.listIsEmpty() && state == State.LOADING) View.VISIBLE else View.GONE
            txt_error.visibility =
                if (viewModel.listIsEmpty() && state == State.ERROR) View.VISIBLE else View.GONE
            if (!viewModel.listIsEmpty()) {
                newsListAdapter.setState(state ?: State.DONE)
            }
        })

    }
}