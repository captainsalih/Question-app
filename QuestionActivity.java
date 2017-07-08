package com.example.android.quiz_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class QuestionActivity extends AppCompatActivity {

private static final  String TAG = "Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_list);

        final ArrayList<List> list = new ArrayList<List>();
        list.add(new List("Question 1", R.drawable.pic2, "who is this ?", "A", "B", "C","D"));
        list.add(new List("Question 2", R.drawable.pic3, "who is this ?", "F", "G", "H","I"));
        list.add(new List("Question 3", R.drawable.pic4, "who is this ?", "J", "K", "L","M "));
        list.add(new List("Question 4", R.drawable.pic5, "who is this ?", "N", "O", "P","Q ", R.id.submit));

        // Find a reference to the {@link List} in the layout
        ListView listView =(ListView) findViewById(R.id.Question_list);
        // Create a new adapter that takes the list of list as input
       final Adapter adapter = new Adapter(this,list);

        // Set the adapter on the {@link List}
        listView.setAdapter(adapter);


    }
}
