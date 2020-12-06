package com.base.newmovie.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.base.newmovie.api.Network
import com.base.newmovie.data.*
import io.reactivex.disposables.CompositeDisposable

class DetailViewModel : ViewModel() {
    private val networkService = Network.getService()
    lateinit var Detailmovie: LiveData<Movie>
    private val compositeDisposable = CompositeDisposable()

    init {


    }






    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}