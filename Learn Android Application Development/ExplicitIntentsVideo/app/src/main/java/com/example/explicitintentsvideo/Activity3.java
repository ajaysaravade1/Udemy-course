package com.example.explicitintentsvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    EditText etName;
    Button btnSubmit;
    Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        etName = findViewById(R.id.etName);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnCancel=findViewById(R.id.btnCancel);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String surname = etName.getText().toString().trim();

                if(surname.isEmpty())
                {

                    Toast.makeText(getApplicationContext(),"Please Enter Surname",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent();
                    intent.putExtra("surname",surname);
                    setResult(RESULT_OK,intent);
                    Activity3.this.finish();
                }
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                Activity3.this.finish();
            }
        });
    }
}
