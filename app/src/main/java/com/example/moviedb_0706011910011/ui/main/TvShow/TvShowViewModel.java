package com.example.moviedb_0706011910011.ui.main.TvShow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviedb_0706011910011.model.Movie;
import com.example.moviedb_0706011910011.model.TvShow;
import com.example.moviedb_0706011910011.repository.MovieRepository;
import com.example.moviedb_0706011910011.repository.TvShowRepository;

import java.util.List;

public class TvShowViewModel extends ViewModel {

    private TvShowRepository repository;

    public TvShowViewModel() {
        repository = TvShowRepository.getInstance();
    }

    public LiveData<List<TvShow>> getTvShowCollection(){
        return repository.getTvShowCollection();
    }
}
