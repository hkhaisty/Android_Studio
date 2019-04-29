package com.example.lab_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_B extends AppCompatActivity {

    private TextView textView;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        textView = findViewById(R.id.textView2);
        textView.setText("URL: http://android.developer.com in Activity B");

        backButton = findViewById(R.id.backButtonB);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_B.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
