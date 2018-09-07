package com.swapniljain.jokesactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static String JOKE_EXTRA = "joke_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView jokeTextView = (TextView) findViewById(R.id.text_view_joke);
        Intent intent = getIntent();
        if (intent.hasExtra(JOKE_EXTRA)) {
            jokeTextView.setText(intent.getStringExtra(JOKE_EXTRA));
        }

        setTitle("Joke of the Day!");
    }

}
