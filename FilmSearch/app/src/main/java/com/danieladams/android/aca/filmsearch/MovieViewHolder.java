package com.danieladams.android.aca.filmsearch;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by danieladams on 10/17/16.
 */

public class MovieViewHolder extends RecyclerView.ViewHolder
{
    public ImageView imageView;
    public ImageView imageView2;
    public TextView mTextView;
    public MovieViewHolder(View itemView)
    {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        imageView2 = (ImageView) itemView.findViewById(R.id.imageView2);
        mTextView = (TextView) mTextView.findViewById(R.id.textView);
    }
}







