package com.example.explicitintentsvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tvWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        String name =getIntent().getStringExtra("name");
        tvWelcome=findViewById(R.id.tvWelcome);

        tvWelcome.setText("Welcome "+name);

    }
}
