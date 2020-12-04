package com.base.newmovie.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.base.newmovie.api.Network
import com.base.newmovie.data.Movie
import com.base.newmovie.data.State

import io.reactivex.disposables.CompositeDisposable

class MoviesListViewModel : ViewModel() {

   /* private val networkService = Network.getService()
    var moviesList: LiveData<PagedList<Movie>>
    private val compositeDisposable = CompositeDisposable()
    private val pageSize = 5
    private val newsDataSourceFactory: NewsDataSourceFactory

    init {
        newsDataSourceFactory = NewsDataSourceFactory(compositeDisposable, networkService)
        val config = PagedList.Config.Builder()
                .setPageSize(pageSize)
                .setInitialLoadSizeHint(pageSize * 2)
                .setEnablePlaceholders(false)
                .build()
        moviesList = LivePagedListBuilder(newsDataSourceFactory, config).build()
    }


    fun getState(): LiveData<State> = Transformations.switchMap(
            newsDataSourceFactory.newsDataSourceLiveData,
            NewsDataSource::state
    )

    fun retry() {
        newsDataSourceFactory.newsDataSourceLiveData.value?.retry()
    }

    fun listIsEmpty(): Boolean {
        return moviesList.value?.isEmpty() ?: true
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }*/
}