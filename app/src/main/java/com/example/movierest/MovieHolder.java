package com.example.movierest;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MovieHolder extends RecyclerView.ViewHolder {

    ImageView movieImageView;
    TextView titleTextView;
    TextView overviewTextView;
    TextView ratingTextView;
    ConstraintLayout constraintLayout;

    public MovieHolder(@NonNull View itemView) {
        super(itemView);
        movieImageView = itemView.findViewById(R.id.movieImageView);
        titleTextView = itemView.findViewById(R.id.movieNameTextView);
        overviewTextView = itemView.findViewById(R.id.movieOverviewTextView);
        ratingTextView = itemView.findViewById(R.id.ratingMovieTextView);
        constraintLayout = itemView.findViewById(R.id.mainLayout);
    }
}
