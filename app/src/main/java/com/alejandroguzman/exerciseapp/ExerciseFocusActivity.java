package com.alejandroguzman.exerciseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExerciseFocusActivity extends AppCompatActivity {

    TextView name;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_focus);

        name = (TextView) findViewById(R.id.name);


        Intent i = getIntent();

        int positon = i.getIntExtra("position", -1);

        name.setText(MainActivity.exercises.get(positon).getName());


    }
}
