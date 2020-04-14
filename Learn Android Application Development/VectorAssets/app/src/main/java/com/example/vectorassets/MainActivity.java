package com.example.vectorassets;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivCake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivCake = findViewById(R.id.ivCake);
        ivCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivCake.setImageResource(R.drawable.ic_person_black_24dp);
            }
        });
    }
}
