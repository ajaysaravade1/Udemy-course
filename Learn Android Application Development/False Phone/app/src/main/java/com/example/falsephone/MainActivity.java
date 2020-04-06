package com.example.falsephone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMsg = findViewById(R.id.tvMsg);

        if (getIntent().getData() != null) {
            tvMsg.setText("Data is :"+getIntent().getData().toString());
        } else {
            tvMsg.setText("No Data Received");;
        }

    }
}
