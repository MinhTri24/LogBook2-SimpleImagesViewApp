package com.example.logbook2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button previousButton, nextButton;
    int[] imageIds = { R.drawable.img1, R.drawable.img2, R.drawable.img3 };
    int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        previousButton = findViewById(R.id.prevButton);
        nextButton = findViewById(R.id.nextButton);

        previousButton.setOnClickListener(v -> {
            currentImageIndex--;
            if (currentImageIndex < 0) {
                currentImageIndex = imageIds.length - 1;
            }
            imageView.setImageResource(imageIds[currentImageIndex]);
        });

        nextButton.setOnClickListener(v -> {
            currentImageIndex++;
            if (currentImageIndex >= imageIds.length) {
                currentImageIndex = 0;
            }
            imageView.setImageResource(imageIds[currentImageIndex]);
        });

    }
}