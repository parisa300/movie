package com.base.newmovie.data

import com.google.gson.annotations.SerializedName

data class Search(

    @SerializedName("Title")
    val title: String,
    @SerializedName("Year")
    val Year: String?,
    @SerializedName("imdbID")
    val imdbID: String?,
    @SerializedName("Type")
    val Type: String?,

    @SerializedName("Poster")
    val Poster: String?



)