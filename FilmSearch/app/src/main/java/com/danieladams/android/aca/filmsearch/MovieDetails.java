package com.danieladams.android.aca.filmsearch;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieDetails extends AppCompatActivity {

    private List<Movie> mMovieList;
    private Context mContext;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);



    }

    public void onBindViewHolder(MovieViewHolder holder, int position)
    {
        Movie movie = mMovieList.get(position);

        Picasso.with(mContext)
                .load(movie.getPoster())
                .placeholder(R.color.colorAccent)
                .into(holder.imageView);
    }
}
