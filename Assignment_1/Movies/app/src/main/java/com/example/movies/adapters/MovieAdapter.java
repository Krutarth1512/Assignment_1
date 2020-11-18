package com.example.movies.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.movies.R;
import com.example.movies.models.Movie;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {

    private ArrayList<Movie> moviesList;

    public MovieAdapter(ArrayList<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public int getCount() {
        return moviesList.size();
    }

    @Override
    public Movie getItem(int position) {
        return moviesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return moviesList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MovieViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, null);
            viewHolder = new MovieViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MovieViewHolder) convertView.getTag();
        }
        Movie movie = getItem(position);
        viewHolder.titleText.setText(movie.getTitle());
        String ratings = "IMDb Rating: " + movie.getRatings();
        viewHolder.ratingsText.setText(ratings);
        viewHolder.descriptionText.setText(movie.getDescription());
        viewHolder.posterImage.setImageResource(movie.getImage());
        return convertView;
    }

    public static class MovieViewHolder {

        TextView titleText, ratingsText, descriptionText;
        ImageView posterImage;

        MovieViewHolder(View view) {
            titleText = view.findViewById(R.id.title_text);
            ratingsText = view.findViewById(R.id.ratings_text);
            descriptionText = view.findViewById(R.id.description_text);
            posterImage = view.findViewById(R.id.poster_image);
        }
    }
}
