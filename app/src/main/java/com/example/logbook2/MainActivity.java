package com.example.logbook2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private int currentIndex = 0;
    private int[] imageIds = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(imageIds[currentIndex]);
    }

    public void showPreviousImg(View view) {
        if (currentIndex > 0) {
            currentIndex--;
            imageView.setImageResource(imageIds[currentIndex]);
        }
    }


    public void showNextImg(View view) {
        if (currentIndex < imageIds.length - 1) {
            currentIndex++;
            imageView.setImageResource(imageIds[currentIndex]);
        }
    }
}