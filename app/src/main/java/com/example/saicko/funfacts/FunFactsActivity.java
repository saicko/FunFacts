package com.example.saicko.funfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //nabrajamo varijable

        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);

        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.sasa);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();



                //update fact
                factLabel.setText(fact);

                rl.setBackgroundColor(color);

                showFactButton.setTextColor(color);




            }
        };

        showFactButton.setOnClickListener(listener);

        //Toast.makeText(this, "Yay!", Toast.LENGTH_LONG).show();

        Log.d(TAG, "We're logging from the onCreate() method");

    }


}
