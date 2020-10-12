package com.example.moviedb_0706011910011.ui.main.movie;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.moviedb_0706011910011.R;
import com.example.moviedb_0706011910011.model.Movie;
import com.example.moviedb_0706011910011.ui.splash.SplashFragmentDirections;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieFragment extends Fragment {
    @BindView(R.id.btn_toDetail)
    Button btn_toDetail;

    public MovieFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        Movie movie = new Movie();

        btn_toDetail.setOnClickListener(view1 ->{
            NavDirections action = MovieFragmentDirections.actionDetailFragment(movie);
            Navigation.findNavController(view).navigate(action);
        });
    }
}