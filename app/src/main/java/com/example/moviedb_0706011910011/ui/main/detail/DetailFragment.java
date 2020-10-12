package com.example.moviedb_0706011910011.ui.main.detail;

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
import com.example.moviedb_0706011910011.ui.splash.SplashFragmentDirections;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailFragment extends Fragment {
    @BindView(R.id.btn_toMovie)
    Button btn_toMovie;

    public DetailFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        btn_toMovie.setOnClickListener(view1 -> {
            NavDirections action = DetailFragmentDirections.actionDetailFragmentToMovieFragment22();
            Navigation.findNavController(view).navigate(action);
        });
    }
}