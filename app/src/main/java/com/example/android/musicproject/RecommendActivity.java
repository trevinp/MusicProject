package com.example.android.musicproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecommendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

        final Button home = (Button) findViewById(R.id.button_home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(RecommendActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        final TextView item1 = (TextView) findViewById(R.id.item1);

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent item1Intent = new Intent(RecommendActivity.this, DetailActivity.class);
                startActivity(item1Intent);
            }
        });

        final TextView item2 = (TextView) findViewById(R.id.item2);

        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent item2Intent = new Intent(RecommendActivity.this, DetailActivity.class);
                startActivity(item2Intent);
            }
        });

        final TextView item3 = (TextView) findViewById(R.id.item3);

        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent item3Intent = new Intent(RecommendActivity.this, DetailActivity.class);
                startActivity(item3Intent);
            }
        });

    }

}
