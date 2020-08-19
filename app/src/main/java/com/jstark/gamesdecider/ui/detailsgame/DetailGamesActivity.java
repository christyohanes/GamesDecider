package com.jstark.gamesdecider.ui.detailsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textview.MaterialTextView;
import com.jstark.gamesdecider.R;

public class DetailGamesActivity extends AppCompatActivity {
    ImageView ivPoster;
    ImageButton btnBack;
    MaterialTextView tvgameTitle, tvgameGenre, tvgameDeveloper, tvgameDescription;

    String gameTitle, gameGenre, gameDeveloper, gameDescription;
    int poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_games);

        btnBack = findViewById(R.id.btn_back);
        ivPoster = findViewById(R.id.iv_game_posters);
        tvgameTitle = findViewById(R.id.tv_game_title_detail);
        tvgameGenre = findViewById(R.id.tv_email);
        tvgameDeveloper = findViewById(R.id.tv_bdate);
        tvgameDescription = findViewById(R.id.tv_game_description);

        getData();
        setData();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void getData() {
        if (getIntent().hasExtra("Game Title") && getIntent().hasExtra("Game Genre")
                && getIntent().hasExtra("Game Developer") && getIntent().hasExtra("Game Description")
                && getIntent().hasExtra("Game Poster")) {

            gameTitle = getIntent().getStringExtra("Game Title");
            gameGenre = getIntent().getStringExtra("Game Genre");
            gameDeveloper = getIntent().getStringExtra("Game Developer");
            gameDescription = getIntent().getStringExtra("Game Description");
            poster = getIntent().getIntExtra("Game Poster", 1);
        } else {
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        tvgameTitle.setText(gameTitle);
        tvgameGenre.setText(gameGenre);
        tvgameDeveloper.setText(gameDeveloper);
        tvgameDescription.setText(gameDescription);
        ivPoster.setImageResource(poster);
    }
}