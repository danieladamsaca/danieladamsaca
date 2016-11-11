package com.danieladams.android.aca.filmsearch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.Serializable;

@SuppressWarnings("serial")

public class MovieDetails extends AppCompatActivity implements Serializable {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);



    }


}
