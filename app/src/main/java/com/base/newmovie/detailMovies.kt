package com.base.newmovie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import androidx.lifecycle.get
import androidx.navigation.fragment.navArgs
import androidx.navigation.navGraphViewModels
import com.base.newmovie.adapter.MoviesListAdapter
import com.base.newmovie.adapter.MoviesViewHolder
import com.base.newmovie.api.Network
import com.base.newmovie.data.Movie
import com.base.newmovie.repository.moviesRepository
import com.base.newmovie.viewmodel.DetailViewModel
import com.base.newmovie.viewmodel.MoviesListViewModel
import com.bumptech.glide.Glide

import kotlinx.android.synthetic.main.fragment_detail_movies.*




class detailMovies : Fragment(R.layout.fragment_detail_movies) {

     lateinit var detailViewModel: DetailViewModel
     lateinit var moviesRepository: moviesRepository


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val moviId =  MoviesViewHolder.id_movie
        detailViewModel.viewdetail(moviId)
        val apiservice =Network.getService()
        moviesRepository= moviesRepository(apiservice)
     //   detailViewModel =getviewmodel(moviId)

   //  init()

    }
fun init(){

    detailViewModel.Detailmovie.observe(this.viewLifecycleOwner, Observer {
        binduI(it as Movie)
    })
}

    fun  binduI(it : Movie){
        txtactor.text=it.Actors
        txtcountry.text=it.Genre
        txtruntime.text=it.Runtime
        txttitle.text=it.title
        txtyear.text=it.Year
        Glide.with(this)  //2
            .load(it.Poster) //3
            .centerCrop() //4
            .into(this.iv_detail)
    }
 /*fun getviewmodel(moviId :String):DetailViewModel{
   //  return ViewModelProvider(this).get(DetailViewModel ::class.java)
     return ViewModelProvider.AndroidViewModelFactory(activity)
             .create(DetailViewModel::class.java)*/

 }



