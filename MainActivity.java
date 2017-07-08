package com.example.android.quiz_app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the view for start
        TextView startquiz = (TextView) findViewById(R.id.start_quiz);

       //set the click listener
        startquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent questionTemplate = new Intent(MainActivity.this,QuestionActivity.class);

                //start the activity
                startActivity(questionTemplate);
            }
        });
    }
}
//set to validate the name and email