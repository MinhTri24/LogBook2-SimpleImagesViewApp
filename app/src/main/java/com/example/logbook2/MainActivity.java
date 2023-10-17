package com.example.logbook2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;
    Button preBtn, nextBtn;
    int[] images = { R.drawable.img1, R.drawable.img2, R.drawable.img3 };
    int currentImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = findViewById(R.id.imageView);
        preBtn = findViewById(R.id.prevButton);
        nextBtn = findViewById(R.id.nextButton);

        preBtn.setOnClickListener(v -> {
            currentImage--;
            if (currentImage < 0) {
                currentImage = images.length - 1;
            }
            imgView.setImageResource(images[currentImage]);
        });

        nextBtn.setOnClickListener(v -> {
            currentImage++;
            if (currentImage >= images.length) {
                currentImage = 0;
            }
            imgView.setImageResource(images[currentImage]);
        });

    }
}