package com.base.newmovie.data

import com.base.newmovie.adapter.MoviesListAdapter
import java.util.*

private fun setFakeData() {
    val adapter_movie: MoviesListAdapter? = null
    val movies: MutableList<Movie> = ArrayList<Movie>()
    val obj_movie = Movie(
        title = "Breaking Bad",
        Poster = "https://m.media-amazon.com/images/M/MV5BMjhiMzgxZTctNDc1Ni00OTIxLTlhMTYtZTA3ZWFkODRkNmE2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt0903747",
        Genre = "",
        Writer = "",
        Actors = ""
    )

    val obj_movie1 = Movie(
        title = "Joker",
        Poster = "https://m.media-amazon.com/images/M/MV5BNGVjNWI4ZGUtNzE0MS00YTJmLWE0ZDctN2ZiYTk2YmI3NTYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt7286456",
        Genre = "",
        Writer = "",
        Actors = ""
    )

 val obj_movie2 = Movie(
     title = "The Undoing",
     Poster = "https://m.media-amazon.com/images/M/MV5BNzY5YTcxMWYtYjFkZi00ZmI3LThmYjgtMzY0YjQzZWFkNzQ4XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
     Year = "",
     Rated = "",
     Released = "",
     Runtime = "",
     imdbID = "tt8134470",
     Genre = "", Writer = "",
     Actors = ""
 )

    val obj_movie3 = Movie(
        title = "Mosul",
        Poster = "https://m.media-amazon.com/images/M/MV5BYWU1MzZkOGQtMTE2ZS00YmMzLTkzMzctMTc0ZjU1NDFlOWZkXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt9252468",
        Genre = "", Writer = "",
        Actors = ""
    )
    val obj_movie4 = Movie(
        title = "Game of Thrones",
        Poster = "https://m.media-amazon.com/images/M/MV5BYTRiNDQwYzAtMzVlZS00NTI5LWJjYjUtMzkwNTUzMWMxZTllXkEyXkFqcGdeQXVyNDIzMzcwNjc@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt0944947",
        Genre = "", Writer = "",
        Actors = ""
    )

    val obj_movie5 = Movie(
        title = "Inception",
        Poster = "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt0944947",
        Genre = "", Writer = "",
        Actors = ""
    )

    val obj_movie6 = Movie(
        title = "Parasite",
        Poster = "https://m.media-amazon.com/images/M/MV5BYWZjMjk3ZTItODQ2ZC00NTY5LWE0ZDYtZTI3MjcwN2Q5NTVkXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt6751668",
        Genre = "", Writer = "",
        Actors = ""
    )
   val obj_movie7 = Movie(
       title = "Tenet",
       Poster = "https://m.media-amazon.com/images/M/MV5BYzg0NGM2NjAtNmIxOC00MDJmLTg5ZmYtYzM0MTE4NWE2NzlhXkEyXkFqcGdeQXVyMTA4NjE0NjEy._V1_SX300.jpg",
       Year = "",
       Rated = "",
       Released = "",
       Runtime = "",
       imdbID = "tt6723592",
       Genre = "", Writer = "",
       Actors = ""
   )

    val obj_movie8 = Movie(
        title = "The Queen's Gambit",
        Poster = "https://m.media-amazon.com/images/M/MV5BM2EwMmRhMmUtMzBmMS00ZDQ3LTg4OGEtNjlkODk3ZTMxMmJlXkEyXkFqcGdeQXVyMjM5ODk1NDU@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt10048342",
        Genre = "", Writer = "",
        Actors = ""
    )

    val obj_movie9 = Movie(
        title = "Paranormal",
        Poster = "https://m.media-amazon.com/images/M/MV5BNGY1Y2RlZmItZTQ1Zi00MzUyLThiYzEtZjA2OTIzMTM1YTkwXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt12411074",
        Genre = "", Writer = "",
        Actors = ""
    )
    val obj_movie10 = Movie(
        title = "The Mandalorian",
        Poster = "https://m.media-amazon.com/images/M/MV5BZDhlMzY0ZGItZTcyNS00ZTAxLWIyMmYtZGQ2ODg5OWZiYmJkXkEyXkFqcGdeQXVyODkzNTgxMDg@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt8111088",
        Genre = "", Writer = "",
        Actors = ""
    )
    val obj_movie11 = Movie(
        title = "The Trial of the Chicago 7",
        Poster = "https://m.media-amazon.com/images/M/MV5BYjYzOGE1MjUtODgyMy00ZDAxLTljYTgtNzk0Njg2YWQwMTZhXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt1070874",
        Genre = "", Writer = "",
        Actors = ""
    )
    val obj_movie12 = Movie(
        title = "1917",
        Poster = "https://m.media-amazon.com/images/M/MV5BOTdmNTFjNDEtNzg0My00ZjkxLTg1ZDAtZTdkMDc2ZmFiNWQ1XkEyXkFqcGdeQXVyNTAzNzgwNTg@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt8579674",
        Genre = "", Writer = "",
        Actors = ""
    )
    val obj_movie13 = Movie(
        title = "The Boys",
        Poster = "https://m.media-amazon.com/images/M/MV5BNGEyOGJiNWEtMTgwMi00ODU4LTlkMjItZWI4NjFmMzgxZGY2XkEyXkFqcGdeQXVyNjcyNjcyMzQ@._V1_SX300.jpg",
        Year = "",
        Rated = "",
        Released = "",
        Runtime = "",
        imdbID = "tt1190634",
        Genre = "", Writer = "",
        Actors = ""
    )


    movies.add(obj_movie)
    movies.add(obj_movie1)
    movies.add(obj_movie2)
    movies.add(obj_movie3)
    movies.add(obj_movie4)
    movies.add(obj_movie5)
    movies.add(obj_movie6)
    movies.add(obj_movie7)
    movies.add(obj_movie8)
    movies.add(obj_movie9)
    movies.add(obj_movie10)
    movies.add(obj_movie11)
    movies.add(obj_movie12)
    movies.add(obj_movie13)


  //  adapter_movie?.setData(movies)
}

