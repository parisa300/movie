package com.base.newmovie.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.base.newmovie.api.Network
import com.base.newmovie.data.*
import com.base.newmovie.repository.moviesRepository
import io.reactivex.disposables.CompositeDisposable

class DetailViewModel( val moviesRepository: moviesRepository,movieId :String) : ViewModel() {
  val networkService = Network.getService()

  val compositeDisposable = CompositeDisposable()
   val Detailmovie: LiveData<Movie> by lazy {

       moviesRepository.fetchmoviedetail(compositeDisposable,movieId)


   }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}