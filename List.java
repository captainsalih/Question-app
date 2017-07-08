package com.example.android.quiz_app;

/**
 * Created by mus on 7/4/17.
 */

public class List {
    private String mHead;

    private int mImage;

    private String mQuestion;

    private String mChoiceA;

    private String mChoiceB;

    private String mChoiceC;

    private String mChoiceD;

    private int mNext = NO_VIEW;

    private static final int NO_VIEW = -1;

    //constructor for the object without the next view
    public List(String Head, int image, String question, String choiceA, String choiceB,
                String choiceC, String choiceD){
        mHead = Head;
        mImage = image;
        mQuestion = question;
        mChoiceA = choiceA;
        mChoiceB = choiceB;
        mChoiceC = choiceC;
        mChoiceD = choiceD;
    }

    //constructor for the object with the view
    public List(String Head, int image, String question, String choiceA, String choiceB,
                String choiceC, String choiceD, int Next){
        mHead = Head;
        mImage = image;
        mQuestion = question;
        mChoiceA = choiceA;
        mChoiceB = choiceB;
        mChoiceC = choiceC;
        mChoiceD = choiceD;
        mNext = Next ;
    }

     //get all and return it
    public String getHead() { return mHead;}

    public int getImage(){return mImage;}

    public String getQuestion(){return mQuestion;}

    public String getChoiceA(){return mChoiceA;}

    public String getChoiceB(){return mChoiceB;}

    public String getChoiceC(){return mChoiceC;}

    public String getChoiceD(){return mChoiceD;}

    public int getNext(){return mNext;}

    public boolean hasView(){return mNext != NO_VIEW;}

}
