package com.alexisg13.ejercicio3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout rojo;
    private LinearLayout verde;
    private LinearLayout azul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rojo = findViewById(R.id.red_layout);
        verde = findViewById(R.id.green_layout);
        azul = findViewById(R.id.blue_layout);

        rojo.setOnClickListener(this);
        verde.setOnClickListener(this);
        azul.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int nuevo_color = (int)(Math.random()*420);
        switch (v.getId()){
            case R.id.red_layout:
                rojo.setBackgroundColor(Color.rgb(nuevo_color,0,0));
                break;

            case R.id.green_layout:
                verde.setBackgroundColor(Color.rgb(0,nuevo_color,0));
                break;

            case R.id.blue_layout:
                azul.setBackgroundColor(Color.rgb(0,0,nuevo_color));
                break;
        }

    }
}
