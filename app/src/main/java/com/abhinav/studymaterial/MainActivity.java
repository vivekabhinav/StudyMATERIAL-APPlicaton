package com.abhinav.studymaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_Algorithm,btn_Cprograming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Algorithm = (Button) findViewById(R.id.book1);
        btn_Cprograming =(Button) findViewById(R.id.book2);


        btn_Algorithm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Algorithm.class);
                startActivity(i);

            }
        });
        btn_Cprograming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(MainActivity.this,CPrograming.class);
                startActivity(i2);

            }
        });
    }
}
