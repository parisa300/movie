package com.base.newmovie.data

import com.google.gson.annotations.SerializedName

data class Response(
        @SerializedName("Search")
        val movies: List<Search>
)


