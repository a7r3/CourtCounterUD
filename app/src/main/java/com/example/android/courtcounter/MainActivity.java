package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void resetScores(View view){
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        Toast.makeText(this, "Score Reset, Game On!", Toast.LENGTH_SHORT).show();
    }

    public void addThreeForTeamA(View view){
        displayForTeamA(scoreTeamA+=3);
    }

    public void addTwoForTeamA(View view){
        displayForTeamA(scoreTeamA+=2);
    }

    public void addOneForTeamA(View view){
        displayForTeamA(++scoreTeamA);
    }

    public void addThreeForTeamB(View view){
        displayForTeamB(scoreTeamB+=3);
    }

    public void addTwoForTeamB(View view){
        displayForTeamB(scoreTeamB+=2);
    }

    public void addOneForTeamB(View view){
        displayForTeamB(++scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
