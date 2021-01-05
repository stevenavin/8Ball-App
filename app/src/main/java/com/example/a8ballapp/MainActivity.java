package com.example.a8ballapp;

import androidx.appcompat.app.AppCompatActivity;

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

        // Create a variable of type ImageView with the name ballDisplay. Use findViewById() to link the ballDisplay with the ball image from layout file
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        // the array  is linked to the variable called ball array
        final int[] ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        // link the askButton in the layout to the Java code. Store button in a variable called myButton
        Button myButton = findViewById(R.id.askButton);

        //setting a listener on myButton using the dot(.) notation
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random  randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt( 5);
                int imageResourceId = ballArray[number];
                ballDisplay.setImageResource(imageResourceId);
            }
        });

    }
}