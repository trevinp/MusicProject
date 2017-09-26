package com.example.android.musicproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button recommend = (Button) findViewById(R.id.btn_recommend);

        recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recommendIntent = new Intent(MainActivity.this, RecommendActivity.class);
                startActivity(recommendIntent);
            }
        });
    }
}
