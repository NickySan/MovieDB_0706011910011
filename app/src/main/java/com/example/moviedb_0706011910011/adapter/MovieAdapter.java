package com.example.moviedb_0706011910011.adapter;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.moviedb_0706011910011.R;
import com.example.moviedb_0706011910011.model.Movie;
import com.example.moviedb_0706011910011.ui.main.movie.MovieFragmentDirections;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.CardViewViewHolder>{

    private final Context context;
    private List<Movie> listMovie;
    private List<Movie> getListMovie() {
        return listMovie;
    }
    public void setListMovie(List<Movie> listMovie) {
        this.listMovie = listMovie;
    }
    public MovieAdapter(Context context) {
        this.listMovie = new ArrayList<Movie>();
        this.context = context;
    }

    @NonNull
    @Override
    public MovieAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MovieAdapter.CardViewViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull final MovieAdapter.CardViewViewHolder holder, int position) {
        Movie movie = getListMovie().get(position);
        Glide.with(context).load(movie.getCover()).centerCrop().into(holder.img);
        holder.lbl_title.setText(movie.getTitle());
        holder.lbl_date.setText(movie.getReleaseDate());
        holder.lbl_vote.setText(movie.getVote());
        holder.itemView.setOnClickListener(view -> {
            MovieFragmentDirections.ActionDetailFragment action = MovieFragmentDirections.actionDetailFragment(movie, null);
            Navigation.findNavController(view).navigate(action);
        });
        Log.d("Movie",movie.getPoster());
    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }


    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView lbl_title, lbl_date, lbl_vote;

        CardViewViewHolder(View itemView) {
            super(itemView);
            lbl_title = itemView.findViewById(R.id.lbl_title);
            lbl_date = itemView.findViewById(R.id.lbl_date);
            lbl_vote = itemView.findViewById(R.id.txt_vote);
            img = itemView.findViewById(R.id.img_detail_poster);
        }
    }
}