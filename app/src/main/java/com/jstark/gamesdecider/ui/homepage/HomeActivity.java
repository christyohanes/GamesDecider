package com.jstark.gamesdecider.ui.homepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.button.MaterialButton;
import com.jstark.gamesdecider.R;
import com.jstark.gamesdecider.adapter.ListGamesAdapter;
import com.jstark.gamesdecider.model.Games;
import com.jstark.gamesdecider.model.GamesData;
import com.jstark.gamesdecider.ui.aboutme.AboutMeActivity;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView rvGames;
    private ArrayList<Games> list = new ArrayList<>();
    private MaterialButton btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnAbout = findViewById(R.id.btn_about_me);

        rvGames = findViewById(R.id.rv_list_games);
        rvGames.setFocusable(false);
        rvGames.setHasFixedSize(true);

        list.addAll(GamesData.getListData());
        showRecyclerList();
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_to_about = new Intent(HomeActivity.this, AboutMeActivity.class);
                startActivity(next_to_about);
            }
        });
    }

    private void showRecyclerList() {
        rvGames.setLayoutManager(new LinearLayoutManager(this));
        ListGamesAdapter listGamesAdapter = new ListGamesAdapter(list, this);
        rvGames.setAdapter(listGamesAdapter);
    }
}