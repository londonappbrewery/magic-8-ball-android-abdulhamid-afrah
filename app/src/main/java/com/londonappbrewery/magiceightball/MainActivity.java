package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random randomGenerator = new Random();
        final ImageView ballImageView = (ImageView) findViewById(R.id.ballImageView);
        Button askButton = (Button) findViewById(R.id.askButton);
        final int[] ballImages = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ballImageView.setImageResource(ballImages[randomGenerator.nextInt(5)]);
            }
        });
    }
}
