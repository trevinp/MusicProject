package com.example.android.musicproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final Button home = (Button) findViewById(R.id.button_home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        final Button back = (Button) findViewById(R.id.button_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(DetailActivity.this, RecommendActivity.class);
                startActivity(backIntent);
            }
        });

        final Button buy = (Button) findViewById(R.id.button_buy);

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(DetailActivity.this, BuyActivity.class);
                startActivity(buyIntent);
            }
        });
    }
}
