package com.angelviera.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    //private FactBook mFactBook = new FactBook();
    //private ColorWheel mColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare out View variables
        final RelativeLayout background = (RelativeLayout) findViewById(R.id.LayoutView);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //The button was clicked, so update the fact label with a new fact.
                String fact = FactBook.getFact();
                int color = ColorWheel.getColor();

                //Update label and background, with random fact and color respectively
                factLabel.setText(fact);
                background.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);

        Log.e(TAG, "PLEASE SHOW UP I DONT EVEN");

        //Toast.makeText(this, TAG, Toast.LENGTH_LONG).show();


    }
}
