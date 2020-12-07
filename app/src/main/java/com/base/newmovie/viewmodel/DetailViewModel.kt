package com.base.newmovie.viewmodel

import android.util.Log
import androidx.lifecycle.*
import androidx.paging.PagedList
import com.base.newmovie.api.Network
import com.base.newmovie.data.*
import com.base.newmovie.repository.moviesRepository
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.launch

class DetailViewModel( val moviesRepository: moviesRepository,movieId :String) : ViewModel() {
  val networkService = Network.getService()

  val compositeDisposable = CompositeDisposable()
   val Detailmovie: LiveData<Movie> by lazy {

       moviesRepository.fetchmoviedetail(compositeDisposable,movieId)


   }


    fun  viewdetail(movieId :String){

        viewModelScope.launch {
            try {
          val movieId = networkService.getDetailmovie("iddetail")
            } catch (t: Throwable) {
               // Log.e(t.toString())
            }
        }
    }
    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}