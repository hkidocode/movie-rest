package com.example.movierest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        ImageView movieImageView = findViewById(R.id.movieImageView2);
        TextView titleTextView = findViewById(R.id.movieNameTextView2);
        TextView ratingTextView = findViewById(R.id.ratingMovieTextView2);
        TextView overviewTextView = findViewById(R.id.descriptionMovieTextView);
        String title = getIntent().getStringExtra("title");
        String poster = getIntent().getStringExtra("poster");
        String overview = getIntent().getStringExtra("overview");
        double rating = this.getIntent().getDoubleExtra("rating", 0);
        Glide.with(MovieDetailActivity.this).load(poster).into(movieImageView);
        ratingTextView.setText(Double.toString(rating));
        titleTextView.setText(title);
        overviewTextView.setText(overview);
    }
}