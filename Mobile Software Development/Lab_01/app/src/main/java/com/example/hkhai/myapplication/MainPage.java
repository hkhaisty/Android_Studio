package com.example.hkhai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
Name: Harry Haisty
Instructor: Dr. Selena He
Date: 1/12/19
Assignment: Lab 01

 */

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText editableText = (EditText)findViewById(R.id.editText);
                TextView textView = (TextView)findViewById(R.id.textView4);
                String userInput = editableText.getText().toString();
                textView.setText(userInput + " is fun!" );
            }
        });
    }
}
