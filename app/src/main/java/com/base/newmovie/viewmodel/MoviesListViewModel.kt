package com.base.newmovie.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.base.newmovie.api.Network
import com.base.newmovie.data.MovieDataSource
import com.base.newmovie.data.Search
import com.base.newmovie.data.State
import com.base.newmovie.data.MoviesDataSourceFactory

import io.reactivex.disposables.CompositeDisposable

class MoviesListViewModel : ViewModel() {

   private val networkService = Network.getService()
    var moviesList: LiveData<PagedList<Search>>
    private val compositeDisposable = CompositeDisposable()
    private val pageSize = 5
    private val moviesDataSourceFactory: MoviesDataSourceFactory

    init {
        moviesDataSourceFactory = MoviesDataSourceFactory(compositeDisposable, networkService)
        val config = PagedList.Config.Builder()
                .setPageSize(pageSize)
                .setInitialLoadSizeHint(pageSize * 2)
                .setEnablePlaceholders(false)
                .build()
        moviesList = LivePagedListBuilder(moviesDataSourceFactory, config).build()
    }


    fun getState(): LiveData<State> = Transformations.switchMap(
        moviesDataSourceFactory.moviesDataSourceLiveData,
            MovieDataSource::state
    )

    fun retry() {
        moviesDataSourceFactory.moviesDataSourceLiveData.value?.retry()
    }

    fun listIsEmpty(): Boolean {
        return moviesList.value?.isEmpty() ?: true
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}