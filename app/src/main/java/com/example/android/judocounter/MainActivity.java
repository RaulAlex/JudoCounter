package com.example.android.judocounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreXien = 0;
    int scorePeter = 0;
    int penaltyXien = 0;
    int penaltyPeter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addHundredForXien(View v) {
        scoreXien = scoreXien + 100;
        displayForXien(scoreXien);
    }

    public void addTenForXien(View v) {
        scoreXien = scoreXien + 10;
        displayForXien(scoreXien);
    }

    public void addOneForXien(View v) {
        scoreXien = scoreXien + 1;
        displayForXien(scoreXien);
    }


    public void addHundredForPeter(View v) {
        scorePeter = scorePeter + 100;
        displayForPeter(scorePeter);
    }

    public void addTenForPeter(View v) {
        scorePeter = scorePeter + 10;
        displayForPeter(scorePeter);
    }

    public void addOneForPeter(View v) {
        scorePeter = scorePeter + 1;
        displayForPeter(scorePeter);
    }

    public void addOnePenaltyXien(View v) {
        penaltyXien = penaltyXien + 1;
        displayPenaltyForXien(penaltyXien);
    }

    public void addOnePenaltyPeter(View v) {
        penaltyPeter = penaltyPeter + 1;
        displayPenaltyForPeter(penaltyPeter);
    }

    public void ResetScore(View v) {
        scoreXien = 0;
        scorePeter = 0;
        penaltyXien = 0;
        penaltyPeter = 0;
        displayForXien(scoreXien);
        displayForPeter(scorePeter);
        displayPenaltyForXien(penaltyXien);
        displayPenaltyForPeter(penaltyPeter);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForXien(int score) {
        TextView scoreView = (TextView) findViewById(R.id.xien_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForPeter(int score) {
        TextView scoreView = (TextView) findViewById(R.id.peter_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayPenaltyForXien(int penalty) {
        TextView scoreView = (TextView) findViewById(R.id.XienNoOfPenalties);
        scoreView.setText(String.valueOf(penalty));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayPenaltyForPeter(int penalty) {
        TextView scoreView = (TextView) findViewById(R.id.PeterNoOfPenalties);
        scoreView.setText(String.valueOf(penalty));
    }


}