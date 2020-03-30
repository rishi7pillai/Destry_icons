package com.example.destry_icons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import tyrantgit.explosionfield.ExplosionField;

public class MainActivity extends AppCompatActivity {
    Button my_button1,my_button2,my_button3;
    TextView my_text;
    ExplosionField explosionField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_button1=(Button)findViewById(R.id.btn_myicon);
        my_button2=(Button)findViewById(R.id.btn_myicon1);
        my_button3=(Button)findViewById(R.id.btn_myicon2);
        my_text=(TextView)findViewById(R.id.txt_destroy);

        explosionField = ExplosionField.attach2Window(this);
        my_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                explosionField.explode(my_button1);
            }
        });
        my_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                explosionField.explode(my_button2);
            }
        });
        my_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                explosionField.explode(my_button3);
            }
        });

        my_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                explosionField.explode(my_text);
            }
        });
    }
}
