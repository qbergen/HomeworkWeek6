package com.example.queenabergen.cuesays;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static com.example.queenabergen.cuesays.R.id.blue_button;
import static com.example.queenabergen.cuesays.R.id.green_button;
import static com.example.queenabergen.cuesays.R.id.red_button;
import static com.example.queenabergen.cuesays.R.id.roundNumber;
import static com.example.queenabergen.cuesays.R.id.yellow_button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
for (int i = 0; i < 15000; i++){
    Log.i("LOG", "i; " + i);
}
        setContentView(R.layout.activity_main);

        int colorArray[] = {yellow_button,red_button,blue_button,green_button};
        int colorSelection;
        int userSelection[];
        int yellowBTN = yellow_button;
        int redBTN = red_button;
        int blueBTN = blue_button;
        int greenBTN = green_button;
        int clicks = 0;

        getRandom(colorArray);
        TextView currentRound = (TextView)findViewById(roundNumber);
        clicks++;


    }

    public void getRandom(int[] array) {
            Random generator = new Random();
            int colorArray[]= {
            yellow_button,
            red_button,
            blue_button,
             green_button,
            };
            int randomIndex = generator.nextInt(colorArray.length);
    }

    public void blueClick(View view) {
        ImageView blueButton = (ImageView) findViewById(blue_button);
      blueButton.setClickable(true);


        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 final ImageView blueButton = (ImageView) findViewById(blue_button);
                blueButton.setVisibility(View.INVISIBLE);
                blueButton.postDelayed(new Runnable() {
                    public void run() {
                        blueButton.setVisibility(View.VISIBLE);

                    }
                }, 70);
            }
        });

    }
    public void onClick(View view){

    }


    public void redClick(View view) {
        ImageView redButton = (ImageView) findViewById(R.id.red_button);
        redButton.setClickable(true);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView redButton = (ImageView) findViewById(red_button);
                redButton.setVisibility(View.INVISIBLE);
                redButton.postDelayed(new Runnable() {
                    public void run() {
                        redButton.setVisibility(View.VISIBLE);
                    }
                }, 70);
            }
        });
    }

    public void yellowClick(View view) {
        ImageView yellowButton = (ImageView) findViewById(R.id.yellow_button);
        yellowButton.setClickable(true);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView yellowButton = (ImageView) findViewById(yellow_button);
                yellowButton.setVisibility(View.INVISIBLE);
                yellowButton.postDelayed(new Runnable() {
                    public void run() {
                        yellowButton.setVisibility(View.VISIBLE);
                    }
                }, 70);
            }
        });
    }

    public void greenClick(View view) {
        ImageView greenButton = (ImageView) findViewById(R.id.green_button);
        greenButton.setClickable(true);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ImageView greenButton = (ImageView) findViewById(green_button);
                greenButton.setVisibility(View.INVISIBLE);
                greenButton.postDelayed(new Runnable() {
                    public void run() {
                        greenButton.setVisibility(View.VISIBLE);
                    }
                }, 70);
            }
        });
    }
    //
    //
    //
    //
    //
//this is the space before the end of the class
}


