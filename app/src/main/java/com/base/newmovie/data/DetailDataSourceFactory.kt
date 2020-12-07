package com.base.newmovie.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.base.newmovie.api.Network
import com.base.newmovie.repository.moviesRepository
import com.base.newmovie.viewmodel.DetailViewModel
import io.reactivex.disposables.CompositeDisposable

class DetailDataSourceFactory(
        private val compositeDisposable: CompositeDisposable,
        private val networkService: Network)

    : ViewModelProvider.Factory {
    val detailDataSourceLiveData = MutableLiveData<DetailDataSource>()
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        val detailsDataSource = MovieDataSource(networkService, compositeDisposable)
      //  detailDataSourceLiveData.postValue(detailsDataSource)
        TODO("Not yet implemented")

    }



  /*  val moviesRepository: moviesRepository
    ):ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return moviesRepository(moviesRepository)as T
        }*/

}