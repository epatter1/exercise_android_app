package com.alejandroguzman.exerciseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView exerciseListView;

    static ArrayList<Exercise> exercises;
    ArrayList<String> exercisesNames;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exerciseListView = (ListView) findViewById(R.id.exerciseListView);

        exercises = new ArrayList();
        exercisesNames = new ArrayList();

        createDummyExercises();

        getNames();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, exercisesNames);

        exerciseListView.setAdapter(adapter);

        exerciseListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), ExerciseFocusActivity.class);
                i.putExtra("position", position);


                 String name = exercises.get(position).getName();
                 i.putExtra("name", name);

                startActivity(i);

            }
        });

    }

    public void createDummyExercises() {

        for(int i = 0; i < 100; i++) {
            exercises.add(new Exercise("Exercise" + String.valueOf(i), "Description" + String.valueOf(i)));
        }

    }

    public void getNames() {

        for (Exercise e : exercises) {
            exercisesNames.add(e.getName());
        }

    }


}
