package com.base.newmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import com.base.newmovie.viewmodel.MoviesListViewModel


class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MoviesListViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // val viewModelProviderFactory=MoviesDataSourceFactory(newsRepository)
      //  viewModel= ViewModelProvider(this,viewModelProviderFactory).get(MoviesListViewModel::class.java)

    }
    override fun onSupportNavigateUp() =
        findNavController(this, R.id.moviesNavHostFragment).navigateUp()
}