package com.example.lab07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startServiceButton;
    Button stopServiceButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent myIntent = new Intent(MainActivity.this, RandomService.class);

        startServiceButton = findViewById(R.id.startButton);
        stopServiceButton = findViewById(R.id.endButton);

        startServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(myIntent);
            }
        });

        stopServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(MainActivity.this, RandomService.class);
                stopService(myIntent);
            }
        });
    }
}
