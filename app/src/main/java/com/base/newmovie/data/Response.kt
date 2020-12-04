package com.base.newmovie.data

import com.google.gson.annotations.SerializedName

data class Response(
        @SerializedName("movie")
        val news: List<Movie>
)

data class Movie(
        val title: String,
        @SerializedName("urlToImage")
        val image: String?
)