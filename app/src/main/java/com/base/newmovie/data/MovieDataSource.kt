package com.base.newmovie.data

import androidx.lifecycle.MutableLiveData
import androidx.paging.PageKeyedDataSource
import com.base.newmovie.api.Network

import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.schedulers.Schedulers

class  MovieDataSource(
        private val networkService: Network,
        private val compositeDisposable: CompositeDisposable)
    : PageKeyedDataSource<Int, Search>() {

    var state: MutableLiveData<State> = MutableLiveData()
    private var retryCompletable: Completable? = null


    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, Search>) {
        updateState(State.LOADING)
        compositeDisposable.add(
                networkService.getMovies(1, params.requestedLoadSize)
                        .subscribe(
                                { response ->
                                    updateState(State.DONE)
                                    callback.onResult(response.movies,
                                            null,
                                            2
                                    )
                                },
                                {
                                    updateState(State.ERROR)
                                    setRetry(Action { loadInitial(params, callback) })
                                }
                        )
        )
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Search>) {
        updateState(State.LOADING)
        compositeDisposable.add(
                networkService.getMovies(params.key, params.requestedLoadSize)
                        .subscribe(
                                { response ->
                                    updateState(State.DONE)
                                    callback.onResult(response.movies,
                                            params.key + 1
                                    )
                                },
                                {
                                    updateState(State.ERROR)
                                    setRetry(Action { loadAfter(params, callback) })
                                }
                        )
        )
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Search>) {
    }

    private fun updateState(state: State) {
        this.state.postValue(state)
    }

    fun retry() {
        if (retryCompletable != null) {
            compositeDisposable.add(retryCompletable!!
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe())
        }
    }

    private fun setRetry(action: Action?) {
        retryCompletable = if (action == null) null else Completable.fromAction(action)
    }

}