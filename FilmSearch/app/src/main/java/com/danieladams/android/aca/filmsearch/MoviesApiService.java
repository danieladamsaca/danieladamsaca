package com.danieladams.android.aca.filmsearch;

import retrofit2.http.GET;
import retrofit2.Call;

/**
 * Created by danieladams on 10/17/16.
 */

public interface MoviesApiService {
    @GET("/3/movie/popular?api_key=720e5f2f6a36c151ad42782b3e5286c2")
    Call<Movie.MovieResult> getPopularMovies();

}
