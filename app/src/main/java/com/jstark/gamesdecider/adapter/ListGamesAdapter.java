package com.jstark.gamesdecider.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.jstark.gamesdecider.R;
import com.jstark.gamesdecider.model.Games;
import com.jstark.gamesdecider.ui.detailsgame.DetailGamesActivity;
import com.jstark.gamesdecider.ui.homepage.HomeActivity;

import java.util.ArrayList;

public class ListGamesAdapter extends RecyclerView.Adapter<ListGamesAdapter.ListViewHolder> {
    private ArrayList<Games> listGames;
    private Context context;

    public ListGamesAdapter(ArrayList<Games> listGames, Context context) {
        this.listGames = listGames;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_games, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        final Games games = listGames.get(position);
        Glide.with(holder.itemView.getContext())
                .load(games.getPoster())
                .apply(new RequestOptions().override(80, 80))
                .into(holder.ivPoster);
        holder.tvTitle.setText(games.getGameTitle());
        holder.tvGenre.setText(games.getGameGenre());

        holder.mainlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_to_details = new Intent(context, DetailGamesActivity.class);
                next_to_details.putExtra("Game Title", games.getGameTitle());
                next_to_details.putExtra("Game Genre", games.getGameGenre());
                next_to_details.putExtra("Game Developer", games.getGameDeveloper());
                next_to_details.putExtra("Game Description", games.getGameDescription());
                next_to_details.putExtra("Game Poster", games.getPoster());
                context.startActivity(next_to_details);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listGames.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPoster;
        TextView tvTitle, tvGenre;
        ConstraintLayout mainlayout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPoster = itemView.findViewById(R.id.iv_game_poster);
            tvTitle = itemView.findViewById(R.id.tv_game_title);
            tvGenre = itemView.findViewById(R.id.tv_game_genre);
            mainlayout = itemView.findViewById(R.id.mainlayout);
        }
    }
}
