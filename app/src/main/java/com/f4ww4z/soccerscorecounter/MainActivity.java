package com.f4ww4z.soccerscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int leftScore = 0,
            rightScore = 0,
            leftYel = 0,
            rightYel = 0,
            leftRed = 0,
            rightRed = 0;
    private String yellowText = "Yellow cards:\n",
            redText = "Red cards:\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resetButton(null);
    }

    public void leftIncScore(View view) {
        // increaseScore(leftScore, 1);
        leftScore = increaseScore(leftScore, 1);
        updateDisplay(R.id.left_score_text, "", leftScore);
    }

    public void rightIncScore(View view) {
        // increaseScore(rightScore, 1);
        rightScore = increaseScore(rightScore, 1);
        updateDisplay(R.id.right_score_text, "", rightScore);
    }

    public void leftYelInc(View view) {
        leftYel = increaseScore(leftYel, 1);
        updateDisplay(R.id.left_yel_card_button, yellowText, leftYel);
    }

    public void rightYelInc(View view) {
        rightYel = increaseScore(rightYel, 1);
        updateDisplay(R.id.right_yel_card_button, yellowText, rightYel);
    }

    public void leftRedInc(View view) {
        leftRed = increaseScore(leftRed, 1);
        updateDisplay(R.id.left_red_card_button, redText, leftRed);
    }

    public void rightRedInc(View view) {
        rightRed = increaseScore(rightRed, 1);
        updateDisplay(R.id.right_red_card_button, redText, rightRed);
    }

    public void resetButton(View view) {
        resetAllScores();
        updateDisplay(R.id.left_score_text, "", leftScore);
        updateDisplay(R.id.right_score_text, "", rightScore);
        updateDisplay(R.id.left_yel_card_button, yellowText, leftYel);
        updateDisplay(R.id.right_yel_card_button, yellowText, rightYel);
        updateDisplay(R.id.left_red_card_button, redText, leftRed);
        updateDisplay(R.id.right_red_card_button, redText, rightRed);
    }

    private int increaseScore(int score, int num) {
        return score += num;
    }

    private void updateDisplay(int textId, String displayText, int score) {
        TextView theView = (TextView) findViewById(textId);
        theView.setText(displayText + score);
    }

    private void resetAllScores() {
        leftScore = 0;
        rightScore = 0;
        leftYel = 0;
        rightYel = 0;
        leftRed = 0;
        rightRed = 0;
    }
}
