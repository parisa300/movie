package com.base.newmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager

import com.base.newmovie.adapter.MoviesListAdapter
import com.base.newmovie.data.State
import com.base.newmovie.viewmodel.MoviesListViewModel

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
   lateinit var viewModel: MoviesListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MoviesListViewModel::class.java)

    }

   override fun onSupportNavigateUp() =
        findNavController(this, R.id.moviesNavHostFragment).navigateUp()
}