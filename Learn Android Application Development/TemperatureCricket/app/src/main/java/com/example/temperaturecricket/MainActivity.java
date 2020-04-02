package com.example.temperaturecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etInput;
    Button btnCalculate;
    TextView tvResult;
    DecimalFormat format;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput =findViewById(R.id.etInput);
        btnCalculate = findViewById(R.id.btnCalulate);
        tvResult = findViewById(R.id.tvResult);
        tvResult.setVisibility(View.INVISIBLE);
        format = new DecimalFormat("#0.00");
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etInput.getText().toString().isEmpty())
                {

                    Toast.makeText(MainActivity.this,"Please Enter all fields",Toast.LENGTH_SHORT);
                }
                else
                {

                    int input= Integer.parseInt(etInput.getText().toString().trim());
                    double temp =(input/3.0)+4;
                    String result= "The approximate temperature outside is " + format.format(temp) + " degrees Celcius.";

                    tvResult.setText(result);
                    tvResult.setVisibility(View.VISIBLE);

                }

            }
        });

    }
}
