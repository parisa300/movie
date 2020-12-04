package com.base.newmovie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.base.newmovie.R
import com.base.newmovie.data.Movie
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_movie.view.*


class MoviesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(movie: Movie?) {
        if (movie != null) {
           itemView.tv_desc.text = movie.title
            if (!movie.image.isNullOrEmpty())


            Glide.with(itemView)  //2
                .load(movie.image) //3
                .centerCrop() //4
                .into(itemView.iv_image)
        }
    }

    companion object {
        fun create(parent: ViewGroup): MoviesViewHolder {
            val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_movie, parent, false)
            return MoviesViewHolder(view)
        }
    }
}