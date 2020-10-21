package com.example.moviedb_0706011910011.ui.main.movie;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviedb_0706011910011.model.Movie;
import com.example.moviedb_0706011910011.repository.MovieRepository;

import java.util.List;

public class MovieViewModel extends ViewModel {

    private MovieRepository repository;

    public MovieViewModel() {
        repository = MovieRepository.getInstance();
    }

    public LiveData<List<Movie>> getMovieCollection(){
        return repository.getMovieCollection();
    }
}
