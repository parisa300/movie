package com.base.newmovie.api

import com.base.newmovie.data.Response
import com.base.newmovie.utils.Constants
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface Network {

    @GET("")
    fun getNews(
        @Query("page") page: Int,
        @Query("pageSize") pageSize: Int
    ): Single<Response>


    companion object{

        fun getService(): Network {
            val retrofit = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(Network::class.java)
        }
    }
}