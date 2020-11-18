package com.example.movies;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movies.adapters.MovieAdapter;
import com.example.movies.models.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Movie> moviesList;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        moviesList = new ArrayList<>();
        moviesList.add(new Movie(1, "Bumble Bee", 6.8, "During the Cybertron Civil War, Optimus Prime sends Autobot scout B-127 to Earth to form a base where they can regroup. Later, the scout befriends a girl named Charlie, who names him Bumblebee.", R.drawable.bumble));
        moviesList.add(new Movie(2, "Iron Man",7.9 , "Iron Man is a 2008 American superhero film based on the Marvel Comics character of the same name.", R.drawable.man));
        moviesList.add(new Movie(3, "Black Panther", 7.3, " After his father's death, T'Challa returns home to Wakanda to inherit his throne. However, a powerful enemy related to his family threatens to attack his nation.", R.drawable.black));
        moviesList.add(new Movie(4, "The Maze Runner",6.8 , "Homas loses his memory and finds himself trapped in a massive maze called the Glade. He and his friends try to escape from the maze and eventually learn that they are subjects of an experiment.", R.drawable.maze));
        moviesList.add(new Movie(5, "American Assassin", 6.2, "After Mitch loses his parents and girlfriend in tragic accidents, he sets out to avenge their deaths and gets himself enlisted in operative missions in order to put an end to terrorist attacks.", R.drawable.american));
        movieAdapter = new MovieAdapter(moviesList);
        listView.setAdapter(movieAdapter);
    }
}