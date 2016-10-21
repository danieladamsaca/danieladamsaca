package com.danieladams.android.aca.filmsearch;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by danieladams on 10/17/16.
 */

public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

    public ImageView imageView;


    public MovieViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {




        Toast.makeText(view.getContext(), "position = " + getPosition(), Toast.LENGTH_SHORT).show();
        //startActivity(new Intent(this, MovieDetails.class));


    }

}








