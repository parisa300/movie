package com.base.newmovie.data

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.base.newmovie.api.Network

import io.reactivex.disposables.CompositeDisposable

class MoviesDataSourceFactory(
        private val compositeDisposable: CompositeDisposable,
        private val networkService: Network)
    : DataSource.Factory<Int, Search>() {

    val newsDataSourceLiveData = MutableLiveData<MovieDataSource>()

    override fun create(): DataSource<Int, Search> {
        val newsDataSource = MovieDataSource(networkService, compositeDisposable)
        newsDataSourceLiveData.postValue(newsDataSource)
        return newsDataSource
    }
}