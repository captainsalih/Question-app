package com.example.android.quiz_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by mus on 7/4/17.
 */

public class Adapter extends ArrayAdapter<List> {

    /**
     constructor to to populate the listview
     */

    public Adapter(Activity context, ArrayList<List> list) {
        // initialize the ArrayAdapter's internal storage for the context and the list.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value.
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.question_template,parent,false);
        }
        // Get the object located at this position in the list
        List currentList = getItem(position);

        //find the id and set to the list for all items
        TextView headView = (TextView)listItemView.findViewById(R.id.head);
        headView.setText(currentList.getHead());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentList.getImage());

        TextView questionView = (TextView) listItemView.findViewById(R.id.thequestion);
        questionView.setText(currentList.getQuestion());

        TextView choiceaView = (TextView) listItemView.findViewById(R.id.answer1);
        choiceaView.setText(currentList.getChoiceA());

        TextView choicebView = (TextView) listItemView.findViewById(R.id.answer2);
        choicebView.setText(currentList.getChoiceB());

        TextView choicecView = (TextView) listItemView.findViewById(R.id.answer3);
        choicecView.setText(currentList.getChoiceC());

        TextView choicedView = (TextView) listItemView.findViewById(R.id.answer4);
        choicedView.setText(currentList.getChoiceD());

        TextView nextView = (TextView) listItemView.findViewById(R.id.submit);

        if (currentList.hasView()){
            //Set the view with visibility
            nextView.setText(currentList.getNext());
            nextView.setVisibility(View.VISIBLE);

            //set the clickListener
            nextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "the message",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
        else {
            //Hiding the view
            nextView.setVisibility(View.GONE);
        }
        // Return the whole list item layout & show it to the Listview
        return listItemView;
    }

}

