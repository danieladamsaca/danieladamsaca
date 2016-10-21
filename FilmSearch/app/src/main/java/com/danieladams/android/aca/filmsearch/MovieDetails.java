package com.danieladams.android.aca.filmsearch;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieDetails extends AppCompatActivity {

    private List<Movie> mMovieList;
    private Context mContext;



  /*  OkHttpClient client = new OkHttpClient();

    MediaType mediaType = MediaType.parse("application/json");
    RequestBody body = RequestBody.create(mediaType, "{}");
    Request request = new Request.Builder(this)
            .url("https://api.themoviedb.org/3/movie/%7Bmovie_id%7D?language=en-US&api_key=%3C%3Capi_key%3E%3E")
            .get()
            .addHeader("content-type", "application/json")
            .build();

    Response response = client.newCall(request).execute();*/
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
                .into(holder.imageView2);
    }
}
