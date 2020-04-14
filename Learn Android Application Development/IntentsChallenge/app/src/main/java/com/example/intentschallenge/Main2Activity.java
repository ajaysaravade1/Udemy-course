package com.example.intentschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    EditText name,number,web,add;
    ImageView green,yellow,red;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        web = findViewById(R.id.web);
        add = findViewById(R.id.add);

        green = findViewById(R.id.green);
        yellow = findViewById(R.id.yellow);
        red = findViewById(R.id.red);

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name",name.getText().toString().trim());
                intent.putExtra("number",number.getText().toString().trim());

                intent.putExtra("web",web.getText().toString().trim());
                intent.putExtra("add",add.getText().toString().trim());
                intent.putExtra("smile",R.drawable.ic_sentiment_satisfied_black_24dp);
                setResult(RESULT_OK,intent);
                Main2Activity.this.finish();
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name",name.getText().toString().trim());
                intent.putExtra("number",number.getText().toString().trim());

                intent.putExtra("web",web.getText().toString().trim());
                intent.putExtra("add",add.getText().toString().trim());
                intent.putExtra("smile",R.drawable.ic_sentiment_neutral_black_24dp);
                setResult(RESULT_OK,intent);
                Main2Activity.this.finish();
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name",name.getText().toString().trim());
                intent.putExtra("number",number.getText().toString().trim());
                intent.putExtra("web",web.getText().toString().trim());
                intent.putExtra("add",add.getText().toString().trim());
                intent.putExtra("smile",R.drawable.ic_sentiment_dissatisfied_black_24dp);
                setResult(RESULT_OK,intent);
                Main2Activity.this.finish();
            }
        });
    }
}
