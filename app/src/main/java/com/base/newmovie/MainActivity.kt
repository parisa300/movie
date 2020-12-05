package com.base.newmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import com.base.newmovie.adapter.MoviesListAdapter
import com.base.newmovie.viewmodel.MoviesListViewModel


class MainActivity : AppCompatActivity() {
     lateinit var viewModel: MoviesListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // val viewModelProviderFactory=MoviesDataSourceFactory(newsRepository)
      //  viewModel= ViewModelProvider(this,viewModelProviderFactory).get(MoviesListViewModel::class.java)
        viewModel = ViewModelProvider(this).get(MoviesListViewModel::class.java)
    //    initAdapter()
     //   initState()
    }


  /*  private fun initAdapter() {
        newsListAdapter = NewsListAdapter { viewModel.retry() }
        recycler_view.adapter = newsListAdapter
        viewModel.newsList.observe(this,
            Observer {
                newsListAdapter.submitList(it)
            })
    }

    private fun initState() {
        txt_error.setOnClickListener { viewModel.retry() }
        viewModel.getState().observe(this, Observer { state ->
            progress_bar.visibility = if (viewModel.listIsEmpty() && state == LOADING) View.VISIBLE else View.GONE
            txt_error.visibility = if (viewModel.listIsEmpty() && state == ERROR) View.VISIBLE else View.GONE
            if (!viewModel.listIsEmpty()) {
                newsListAdapter.setState(state ?: State.DONE)
            }
        })*/

    override fun onSupportNavigateUp() =
        findNavController(this, R.id.moviesNavHostFragment).navigateUp()
}