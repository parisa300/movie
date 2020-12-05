package com.base.newmovie.data

import com.google.gson.annotations.SerializedName

data class Movie(

    @SerializedName("Title")
    val title: String,
    @SerializedName("Poster")
    val Poster: String?,
    @SerializedName("Year")
    val Year: String?,
    @SerializedName("Rated")
    val Rated: String?,

    @SerializedName("Released")
    val Released: String?,

    @SerializedName("Runtime")
    val Runtime: String?,

    @SerializedName("imdbID")
    val imdbID: String?,

    @SerializedName("Genre")
    val Genre: String?,

    @SerializedName("Writer")
    val Writer: String?,

    @SerializedName("Actors")
    val Actors: String?

)