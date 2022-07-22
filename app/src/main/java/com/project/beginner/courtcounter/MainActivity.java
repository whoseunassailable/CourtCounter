package com.project.beginner.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreOne = 0;
    int scoreTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointerA(View view) {
        scoreOne = scoreOne + 3;
        displayThreePointerA(scoreOne);
    }

    public void addTwoPointerA(View view) {
        scoreOne = scoreOne + 2;
        displayTwoPointerA(scoreOne);
    }

    public void addFreeThrowA(View view) {
        scoreOne++;
        displayFreeThrowA(scoreOne);
    }

    public void addThreePointerB(View view) {
        scoreTwo = scoreTwo + 3;
        displayThreePointerB(scoreTwo);
    }

    public void addTwoPointerB(View view) {
        scoreTwo = scoreTwo + 2;
        displayTwoPointerB(scoreTwo);
    }

    public void addFreeThrowB(View view) {
        scoreTwo++;
        displayFreeThrowB(scoreTwo);
    }

    public void reset(View view) {
        scoreOne = 0;
        displayReset(scoreOne);
    }


    public void displayThreePointerA(int threePoints) {
        TextView threePointerView = (TextView) findViewById(R.id.team_a_score);
        threePointerView.setText("Scored " + threePoints + " points");
    }

    public void displayTwoPointerA(int twoPoints) {
        TextView twoPointerView = (TextView) findViewById(R.id.team_a_score);
        twoPointerView.setText("Scored " + twoPoints + " points");
    }

    public void displayFreeThrowA(int onePoint) {
        TextView freeThrow = (TextView) findViewById(R.id.team_a_score);
        freeThrow.setText("Scored " + onePoint + " points");
    }

    public void displayThreePointerB(int threePoints) {
        TextView threePointerView = (TextView) findViewById(R.id.team_b_score);
        threePointerView.setText("Scored " + threePoints + " points");
    }

    public void displayTwoPointerB(int twoPoints) {
        TextView twoPointerView = (TextView) findViewById(R.id.team_b_score);
        twoPointerView.setText("Scored " + twoPoints + " points");
    }

    public void displayFreeThrowB(int onePoint) {
        TextView freeThrow = (TextView) findViewById(R.id.team_b_score);
        freeThrow.setText("Scored " + onePoint + " points");
    }

    public void displayReset(int zero) {
        TextView resetA = (TextView) findViewById(R.id.team_a_score);
        resetA.setText("Score is " + zero);

        TextView resetB = (TextView) findViewById(R.id.team_b_score);
        resetB.setText("Score is " + zero);
    }

}