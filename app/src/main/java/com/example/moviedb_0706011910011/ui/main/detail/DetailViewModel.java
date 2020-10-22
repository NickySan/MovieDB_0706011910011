package com.example.moviedb_0706011910011.ui.main.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviedb_0706011910011.model.cast.Cast;
import com.example.moviedb_0706011910011.model.genre.Genre;
import com.example.moviedb_0706011910011.repository.MovieRepository;
import com.example.moviedb_0706011910011.repository.TvShowRepository;

import java.util.List;

public class DetailViewModel extends ViewModel {

    private MovieRepository movieRepository;
    private TvShowRepository tvShowRepository;

    public DetailViewModel() {
       movieRepository = MovieRepository.getInstance();
       tvShowRepository = TvShowRepository.getInstance();
    }

    public LiveData<List<Genre>> getMovieGenre(int id) {
        return movieRepository.getGenres(id);
    }

    public LiveData<List<Genre>> getTvShowGenre(int id) {
        return tvShowRepository.getGenres(id);
    }

    public LiveData<List<Cast>> getShowCast(int id) {
        return tvShowRepository.getCasts(id);
    }

    public LiveData<List<Cast>> getMovieCast(int id) {
        return movieRepository.getCasts(id);
    }
}