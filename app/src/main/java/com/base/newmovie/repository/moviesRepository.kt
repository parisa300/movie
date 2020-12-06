package com.base.newmovie.repository

import androidx.lifecycle.LiveData
import com.base.newmovie.api.Network
import com.base.newmovie.data.DetailDataSource
import com.base.newmovie.data.Movie
import com.base.newmovie.data.MovieDataSource
import com.base.newmovie.data.State
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.internal.disposables.ArrayCompositeDisposable

class moviesRepository (private val apiService :Network){
    lateinit var DetailDataSource :DetailDataSource
    fun fetchmoviedetail(compositeDisposable: CompositeDisposable,movieId :String):LiveData<Movie>{

        DetailDataSource = DetailDataSource(apiService ,compositeDisposable)
        DetailDataSource.fetchmoviedetail(movieId)
        return DetailDataSource.donloadmovie
    }
    fun getdetaimovie():LiveData<State>{
        return DetailDataSource.state
    }
}