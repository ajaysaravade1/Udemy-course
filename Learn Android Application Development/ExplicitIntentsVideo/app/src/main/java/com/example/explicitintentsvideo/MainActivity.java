package com.example.explicitintentsvideo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etInput;
    Button btnActivity2;
    Button btnActivity3;
    TextView tvResult;

    final int ACTIVITY3=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput=findViewById(R.id.etINPUT);
        btnActivity2=findViewById(R.id.btnActivity2);
        btnActivity3=findViewById(R.id.btnActivity3);
        tvResult=findViewById(R.id.tvResult);
        tvResult.setVisibility(View.GONE);

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = etInput.getText().toString().trim();
                if(input.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter data",Toast.LENGTH_SHORT);
                }
                else {


                    Intent intent2 = new Intent(MainActivity.this, com.example.explicitintentsvideo.Activity2.class);
                    intent2.putExtra("name", input);
                    startActivity(intent2);
                }
            }
        });

        btnActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = etInput.getText().toString().trim();
                Intent intent3 = new Intent(MainActivity.this,com.example.explicitintentsvideo.Activity3.class);
                startActivityForResult(intent3,ACTIVITY3);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==ACTIVITY3)
        {
            if(resultCode==RESULT_OK)
            {
                tvResult.setText(data.getStringExtra("surname").toString());
            }
            if(resultCode==RESULT_CANCELED)
            {
                tvResult.setText("No data found");
            }
            if(requestCode==RESULT_FIRST_USER)
            {
                tvResult.setText("first user");
            }
            tvResult.setVisibility(View.VISIBLE);
        }
    }
}
