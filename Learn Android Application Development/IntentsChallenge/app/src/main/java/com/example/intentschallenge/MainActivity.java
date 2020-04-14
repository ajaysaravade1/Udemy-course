package com.example.intentschallenge;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView smile, call, cal, loc;
    Button btnContact;
    String str_name,str_number,str_web,str_add;
    int RC_1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        smile = findViewById(R.id.smile);
        call = findViewById(R.id.call);
        cal = findViewById(R.id.cal);
        loc = findViewById(R.id.loc);
        btnContact = findViewById(R.id.btnContact);

        smile.setVisibility(View.GONE);
        call.setVisibility(View.GONE);
        cal.setVisibility(View.GONE);
        loc.setVisibility(View.GONE);

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivityForResult(intent, RC_1);

            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+str_number));
                startActivity(intent);

            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://"+str_web));
                startActivity(intent);

            }
        });
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q="+str_add));
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_1 && resultCode == RESULT_OK) {

            str_name = data.getStringExtra("name");
            str_number = data.getStringExtra("number");
            str_web = data.getStringExtra("web");
            str_add = data.getStringExtra("add");

            smile.setImageResource(data.getIntExtra("smile",0));



            call.setVisibility(View.VISIBLE);
            cal.setVisibility(View.VISIBLE);
            loc.setVisibility(View.VISIBLE);
            smile.setVisibility(View.VISIBLE);

        }
    }
}
