package com.base.newmovie.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.PageKeyedDataSource
import com.base.newmovie.adapter.MoviesViewHolder
import com.base.newmovie.api.Network

import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.schedulers.Schedulers
import retrofit2.Response

class DetailDataSource(
        private val networkService: Network,
        private val compositeDisposable: CompositeDisposable)
  {

    var state: MutableLiveData<State> = MutableLiveData()
    private var retryCompletable: Completable? = null

private  val moviedetairesponce =MutableLiveData<Movie>()
      val donloadmovie :LiveData<Movie>
      get() = moviedetairesponce

      fun fetchmoviedetail(movieId :String){

          State.LOADING
          try {
              compositeDisposable.add(
                  networkService.getDetailmovie(movieId)
                      .subscribeOn(Schedulers.io())
                      .subscribe(
                          {
                              moviedetairesponce.postValue(it)
                              State.LOADING
                          },{

                             State.ERROR
                              Log.e("DeatailDatasoure", it.message.toString())
                          }

                      )
              )
          }catch (e :Exception){
              Log.e("DeatailDatasoure", e.message.toString())
          }
      }


}